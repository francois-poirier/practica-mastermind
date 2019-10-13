package mastermind.views.console;

import santaTecla.utils.Console;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	PROPOSE("Propose Combination"),
	UNDO("Undo previous Proposal"),
	REDO("Redo previous Proposal"), 
	NEW_LINE(""),
	OPTION("----- Choose one option -----"),
	NAME("Name: "),
	NEWGAME("Start a new game"),
	EXIT("Exit game"),
	OPENGAME("Open a saved game"),
	SAVE("Do you want to save the game?");

	private String message;
	private Console console;
	
	private MessageView(String message) {
		this.message = message;
		this.console = new Console();
	}
	
	public String getMessage() {
		return this.message;
	}

	public void writeln(int attempts) {
		this.console.writeln(this.message.replaceAll("#attempts", ""+attempts));
	}

	public void writeln() {
		this.console.writeln(this.message);
	}

	public void writeln(int blacks, int whites) {
		this.console.writeln(this.message.replaceAll("#blacks", ""+blacks).replaceAll("#whites", ""+whites));
	}

	public void write() {
		this.console.write(this.message);
	}

}
