package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.console.MessageView;

public class RedoCommand extends Command{
	
	public RedoCommand(PlayController playController) {
		super(MessageView.REDO.getMessage(), playController);
	}

	@Override
	public void execute() {
		((PlayController) this.acceptorController).redo();
	}

	@Override
	public boolean isActive() {
		return ((PlayController) this.acceptorController).redoable();
	}

}