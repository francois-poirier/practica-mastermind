package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;

public class ResultView extends ConsoleDelegate {
	
	private ProposalController proposalController;
	
	public ResultView(ProposalController proposalController){
		this.proposalController = proposalController;
	}

	public void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.proposalController.getBlacks(i))
				.replaceFirst("#whites", "" + this.proposalController.getWhites(i)));
	}

}
