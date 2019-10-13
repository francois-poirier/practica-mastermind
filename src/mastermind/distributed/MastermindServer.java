package mastermind.distributed;

import java.util.HashMap;
import java.util.Map;

import mastermind.dao.SessionImplementationDao;
import mastermind.dao.db.SessionImplementationDbDao;
import mastermind.dao.file.SessionImplementationFileDao;
import mastermind.distributed.dispatchers.DispatcherPrototype;


public class MastermindServer {

	private Map<String, SessionImplementationDao> sessionDaoMap;
	private LogicImplementationServer logic;
	private DispatcherPrototype dispatcherPrototype;

	protected MastermindServer() {
		this.sessionDaoMap = new HashMap<String, SessionImplementationDao>();
		this.sessionDaoMap.put("file", new SessionImplementationFileDao());
		this.sessionDaoMap.put("db", new SessionImplementationDbDao());
		this.dispatcherPrototype = new DispatcherPrototype();
	}

	protected void serve() {
		this.dispatcherPrototype.serve();
	}

	public void play(String arg) {
		SessionImplementationDao sessionImplementationDao = this.sessionDaoMap.get(arg);
		if (sessionImplementationDao!=null) {
			this.logic = new LogicImplementationServer(sessionImplementationDao);
			this.logic.createDispatchers(this.dispatcherPrototype);
			this.serve();
		}
		System.out.println("Session does not exist");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Enter 'file' for files or 'db' for databases");
			System.out.println("java mastermind file");
			System.out.println("java mastermind db");
			System.exit(0);
		}
		new MastermindServer().play(args[0]);
	}

}
