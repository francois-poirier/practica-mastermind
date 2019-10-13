package mastermind.command;

import mastermind.controllers.AcceptorController;
import santaTecla.utils.Console;

public abstract class Command {
	
	protected AcceptorController acceptorController;
	protected String title;
	protected Console console;
	
	protected Command(String title, AcceptorController acceptorController) {
		this.title = title;
		this.acceptorController = acceptorController;
		this.console = new Console();
	}
	
	public abstract void execute();

	public abstract boolean isActive();

	public String getTitle() {
		return this.title;
	}
}
