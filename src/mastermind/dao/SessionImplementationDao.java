package mastermind.dao;

import mastermind.models.SessionImplementation;

public abstract class SessionImplementationDao {
	
	protected SessionImplementation sessionImplementation;

	public void wrap(SessionImplementation sessionImplementation) {
		this.sessionImplementation = sessionImplementation;
	}

	public void save() {
		this.save(this.sessionImplementation.getName());
	}

	public abstract void load(String name);

	public abstract String[] getGamesNames();

	public abstract void save(String name);

	public abstract boolean exists(String name);
	
}
