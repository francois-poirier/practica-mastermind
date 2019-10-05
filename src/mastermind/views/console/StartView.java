package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;

public class StartView extends ConsoleDelegate {
	
	private StartController startController;
	
	private SecretCombinationView secretCombinationView;
	
	public StartView (StartController startController){
		this.startController = startController;
		this.secretCombinationView = new SecretCombinationView(this.startController);
	}

	public void interact() {
		this.console.writeln(MessageView.TITLE.getMessage());
		this.secretCombinationView.writeln();
	}

}
