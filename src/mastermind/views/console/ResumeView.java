package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.MessageView;
import santaTecla.utils.YesNoDialog;

public class ResumeView {
	
	private ResumeController resumeController;

	public ResumeView(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	public boolean interact() {
		boolean newGame = new YesNoDialog().read(MessageView.RESUME.getMessage());
		if (newGame) {
			this.resumeController.clearGame();			
		}
		return newGame;
	}

}
