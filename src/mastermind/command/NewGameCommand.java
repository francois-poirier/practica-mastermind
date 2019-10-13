package mastermind.command;

import mastermind.controllers.StartController;
import mastermind.views.console.MessageView;

public class NewGameCommand extends Command {

	public NewGameCommand(StartController startController) {
		super(MessageView.NEWGAME.getMessage(), startController);
	}

	@Override
	public void execute() {
		((StartController) this.acceptorController).start();
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
