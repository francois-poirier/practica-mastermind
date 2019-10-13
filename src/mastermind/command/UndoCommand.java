package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.console.MessageView;

public class UndoCommand extends Command {

	public UndoCommand(PlayController playController) {
		super(MessageView.UNDO.getMessage(), playController);
	}

	@Override
	public void execute() {
		((PlayController) this.acceptorController).undo();
	}

	@Override
	public boolean isActive() {
		return ((PlayController) this.acceptorController).undoable();
	}
	
}