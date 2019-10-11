package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;
import mastermind.views.console.GameView;

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