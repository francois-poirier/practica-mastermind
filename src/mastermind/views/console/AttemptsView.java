package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;


public class AttemptsView extends ConsoleDelegate {

	private PlayController playController;

	public AttemptsView(PlayController proposalController) {
		this.playController = proposalController;
	}

	public void writeln() {
		MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
	}
}
