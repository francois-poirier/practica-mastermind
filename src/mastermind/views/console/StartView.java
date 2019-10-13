package mastermind.views.console;

import mastermind.controllers.StartController;

public class StartView {

	
	public void interact(StartController startController) {
		MessageView.TITLE.writeln();
		new StartMenu(startController).execute();
		new MasterMindView(startController).writeln();
	}

}
