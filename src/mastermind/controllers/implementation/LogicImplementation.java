package mastermind.controllers.implementation;

import mastermind.controllers.Logic;
import mastermind.dao.SessionImplementationDao;
import mastermind.models.SessionImplementation;
import mastermind.models.StateValue;

public class LogicImplementation extends Logic {

	protected StartControllerImplementation startControllerImplementation;
	protected PlayControllerImplementation playControllerImplementation;
	protected ResumeControllerImplementation resumeControllerImplementation;
	protected SaveControllerImplementation saveControllerImplementation;
	protected SessionImplementationDao sessionImplementationDao;

	public LogicImplementation(SessionImplementationDao sessionImplementationDao) {
		this.session = new SessionImplementation();
		sessionImplementationDao.wrap((SessionImplementation) session);
		this.startControllerImplementation = new StartControllerImplementation(this.session,sessionImplementationDao);
		this.playControllerImplementation = new PlayControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.saveControllerImplementation = new SaveControllerImplementation(this.session,sessionImplementationDao);
		this.acceptorControllers.put(StateValue.INITIAL, this.startControllerImplementation);
		this.acceptorControllers.put(StateValue.IN_GAME, this.playControllerImplementation);
		this.acceptorControllers.put(StateValue.FINAL, this.resumeControllerImplementation);
		this.acceptorControllers.put(StateValue.EXIT, null);
		this.acceptorControllers.put(StateValue.SAVING, this.saveControllerImplementation);
	}

}
