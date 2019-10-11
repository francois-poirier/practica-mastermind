package mastermind.views.console;

import mastermind.command.ProposeCommand;
import mastermind.command.RedoCommand;
import mastermind.command.UndoCommand;
import mastermind.controllers.PlayController;

public class PlayMenu extends Menu {

	public PlayMenu(PlayController playController) {
		this.addCommand(new ProposeCommand(playController));
		this.addCommand(new UndoCommand(playController));
		this.addCommand(new RedoCommand(playController));
	}
	
}
