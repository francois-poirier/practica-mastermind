package mastermind.controllers.implementation;

import java.util.List;

import mastermind.controllers.StartController;
import mastermind.dao.SessionImplementationDao;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;
import mastermind.types.Color;

public class StartControllerImplementation extends StartController {

	private SessionImplementationDao sessionImplementationDao;

	StartControllerImplementation(Session session, SessionImplementationDao sessionImplementationDAO) {
		super(session);
		this.sessionImplementationDao = sessionImplementationDAO;
	}

	@Override
	public void start() {
		((SessionImplementation)this.session).clearGame();
		((SessionImplementation)this.session).registry();
		this.sessionImplementationDao.wrap((SessionImplementation)this.session);
		((SessionImplementation) this.session).next();
	}

	@Override
	public void start(String name) {
		this.sessionImplementationDao.load(name);
	}

	@Override
	public String[] getGamesNames() {
		return this.sessionImplementationDao.getGamesNames();
	}

	@Override
	public int getAttempts() {
		return ((SessionImplementation) this.session).getAttempts();
	}

	@Override
	public List<Color> getColors(int position) {
		return ((SessionImplementation) this.session).getColors(position);
	}

	@Override
	public int getBlacks(int position) {
		return ((SessionImplementation) this.session).getBlacks(position);
	}

	@Override
	public int getWhites(int position) {
		return ((SessionImplementation) this.session).getWhites(position);
	}

	@Override
	public boolean isWinner() {
		return ((SessionImplementation) this.session).isWinner();
	}

	@Override
	public boolean isLooser() {
		return ((SessionImplementation) this.session).isLooser();
	}


}
