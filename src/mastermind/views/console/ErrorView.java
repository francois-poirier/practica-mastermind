package mastermind.views.console;

import mastermind.types.Error;
import santaTecla.utils.ConsoleDelegate;

public class ErrorView extends ConsoleDelegate {

	private static final String[] MESSAGES = { 
		"Repeated colors",
		"Wrong colors, they must be: " + ColorView.allInitials(), 
		"Wrong proposed combination length" };

	private Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	
	
}
