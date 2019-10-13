package mastermind.command;

import mastermind.controllers.PlayController;
import mastermind.views.console.MessageView;

public class ExitCommand extends Command {

	public ExitCommand(PlayController playController) {
		super(MessageView.EXIT.getMessage(), playController);
	}

	@Override
	public void execute() {
		((PlayController) this.acceptorController).next();	
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
