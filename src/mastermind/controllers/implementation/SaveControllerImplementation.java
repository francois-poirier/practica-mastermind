package mastermind.controllers.implementation;

import mastermind.controllers.SaveController;
import mastermind.dao.SessionImplementationDao;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

public class SaveControllerImplementation extends SaveController {

	private SessionImplementationDao sessionImplementationDao;

	SaveControllerImplementation(Session session, SessionImplementationDao sessionImplementationDAO) {
		super(session);
		this.sessionImplementationDao = sessionImplementationDAO;
	}

	@Override
	public void save(String name) {
		this.sessionImplementationDao.save(name);
	}

	@Override
	public void save() {
		this.sessionImplementationDao.save();
	}

	@Override
	public void next() {
		((SessionImplementation) this.session).next();
	}

	@Override
	public boolean hasName() {
		return ((SessionImplementation) this.session).hasName();
	}

	@Override
	public boolean exists(String name) {
		return this.sessionImplementationDao.exists(name);
	}


}