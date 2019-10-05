package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;

public class StartView extends ConsoleDelegate {
	
	private SecretCombinationView secretCombinationView;
	
	public void interact(StartController startController) {
		startController.start();
		this.console.writeln(MessageView.TITLE.getMessage());
		this.secretCombinationView = new SecretCombinationView(startController);
		this.secretCombinationView.writeln();
	}

}
