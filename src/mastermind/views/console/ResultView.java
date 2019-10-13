package mastermind.views.console;

import mastermind.controllers.MasterMindController;

public class ResultView {
	
	private MasterMindController masterMindController;
	
	public ResultView(MasterMindController masterMindController){
		this.masterMindController = masterMindController;
	}

	public void writeln(int position) {
		MessageView.RESULT.writeln(this.masterMindController.getBlacks(position),this.masterMindController.getWhites(position));
	}

}
