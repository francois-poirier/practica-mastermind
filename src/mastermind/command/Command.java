package mastermind.command;

import mastermind.controllers.PlayController;
import santaTecla.utils.Console;

public abstract class Command {
	
	protected PlayController playController;
	protected String title;
	protected Console console;
	
	protected Command(String title, PlayController playController) {
		this.title = title;
		this.playController = playController;
		this.console = new Console();
	}
	
	public abstract void execute();

	public abstract boolean isActive();

	public String getTitle() {
		return this.title;
	}
}
