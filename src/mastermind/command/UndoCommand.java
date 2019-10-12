package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.console.GameView;
import mastermind.views.console.MessageView;

public class UndoCommand extends Command {

	public UndoCommand(PlayController playController) {
		super(MessageView.UNDO_COMMAND.getMessage(), playController);
	}

	@Override
	public void execute() {
		this.playController.undo();
		new GameView(this.playController);
	}

	@Override
	public boolean isActive() {
		return this.playController.undoable();
	}
	
}