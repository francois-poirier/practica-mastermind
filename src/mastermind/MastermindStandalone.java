package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.implementation.LogicImplementation;
import mastermind.dao.SessionImplementationDao;
import mastermind.dao.db.SessionImplementationDbDao;
import mastermind.dao.file.SessionImplementationFileDao;

public class MastermindStandalone extends Mastermind {

	private Map<String, SessionImplementationDao> sessionDaoMap;
	
	public MastermindStandalone() {
		super();
		this.sessionDaoMap = new HashMap<String, SessionImplementationDao>();
		this.sessionDaoMap.put("file", new SessionImplementationFileDao());
		this.sessionDaoMap.put("db", new SessionImplementationDbDao());
	}
	
	public void play(String arg) {
		SessionImplementationDao sessionImplementationDao = this.sessionDaoMap.get(arg);
		if (sessionImplementationDao!=null) {
			this.logic = new LogicImplementation(sessionImplementationDao);
			super.play();
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
		new MastermindStandalone().play(args[0]);
	}

}
