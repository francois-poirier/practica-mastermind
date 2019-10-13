package mastermind.command;

import mastermind.controllers.StartController;
import mastermind.views.console.MasterMindSelectMenu;
import mastermind.views.console.MessageView;

public class OpenGameCommand extends Command{
	
	public OpenGameCommand(StartController startController) {
		super(MessageView.OPENGAME.getMessage(), startController);
	}

	@Override
	public void execute() {
		new MasterMindSelectMenu((StartController) this.acceptorController).execute();
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
