package mastermind.views.console;

import mastermind.controllers.PlayController;

public class AttemptsView {

	private PlayController playController;

	public AttemptsView(PlayController playController) {
		this.playController = playController;
	}

	public void writeln() {
		MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
	}

}
