package mastermind.views.console;

import mastermind.command.MasterMindSelectCommand;
import mastermind.controllers.StartController;

public class MasterMindSelectMenu extends Menu {

	public MasterMindSelectMenu(StartController startController) {
		String[] gamesNames = startController.getGamesNames();
		for (String title : gamesNames) {
			this.addCommand(new MasterMindSelectCommand(title, startController));
		}
	}

}
