package mastermind.views.console;

import mastermind.command.NewGameCommand;
import mastermind.command.OpenGameCommand;
import mastermind.controllers.StartController;

public class StartMenu extends Menu {

	public StartMenu(StartController startController) {
		this.addCommand(new NewGameCommand(startController));
		this.addCommand(new OpenGameCommand(startController));
	}
}
