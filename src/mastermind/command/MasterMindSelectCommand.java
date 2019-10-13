package mastermind.command;

import mastermind.controllers.StartController;

public class MasterMindSelectCommand extends Command {

	public MasterMindSelectCommand(String title, StartController startController) {
		super(title, startController);
	}

	@Override
	public void execute() {
		System.out.println(this.title);
		((StartController) this.acceptorController).start(this.title);
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
