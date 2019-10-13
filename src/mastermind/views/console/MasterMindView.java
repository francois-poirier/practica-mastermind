package mastermind.views.console;

import mastermind.controllers.MasterMindController;

public class MasterMindView {

	public MasterMindController masterMindController;

	public MasterMindView(MasterMindController masterMindController) {
		this.masterMindController = masterMindController;
	}

	public void writeln() {
		MessageView.NEW_LINE.writeln();
		new AttemptsView(this.masterMindController).writeln();
		new SecretCombinationView(this.masterMindController).writeln();
		for (int i = 0; i < this.masterMindController.getAttempts(); i++) {
			new ProposedCombinationView(this.masterMindController).write(i);
			new ResultView(this.masterMindController).writeln(i);
		}
		if (this.masterMindController.isWinner()) {
			MessageView.WINNER.writeln();
		} else if (this.masterMindController.isLooser()) {
			MessageView.LOOSER.writeln();
		}
	}

}
