package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;
import mastermind.views.console.GameView;

public class RedoCommand extends Command{
	
	public RedoCommand(PlayController playController) {
		super(MessageView.REDO_COMMAND.getMessage(), playController);
	}

	@Override
	public void execute() {
		this.playController.redo();
		new GameView(this.playController);
	}

	@Override
	public boolean isActive() {
		return this.playController.redoable();
	}

}