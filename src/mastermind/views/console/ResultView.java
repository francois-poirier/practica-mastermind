package mastermind.views.console;

import mastermind.controllers.PlayController;

public class ResultView {
	
	private PlayController playController;
	
	public ResultView(PlayController playController){
		this.playController = playController;
	}

	public void writeln(int position) {
		MessageView.RESULT.writeln(this.playController.getBlacks(position),this.playController.getWhites(position));
	}

}
