package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;

public class AttemptsView extends ConsoleDelegate {

	private ProposalController proposalController;

	public AttemptsView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	public void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.proposalController.getAttempts()));
	}
}
