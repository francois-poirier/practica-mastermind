package mastermind.views.console;

import mastermind.controllers.MasterMindController;

public class AttemptsView {

	MasterMindController masterMindController;

	public AttemptsView(MasterMindController masterMindController) {
		this.masterMindController = masterMindController;
	}

	public void writeln() {
		MessageView.ATTEMPTS.writeln(this.masterMindController.getAttempts());
	}

}
