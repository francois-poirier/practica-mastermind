package mastermind.views.console;

import mastermind.controllers.ResumeController;
import santaTecla.utils.YesNoDialog;

public class ResumeView {

	public void interact(ResumeController resumeController) {
		resumeController.isNewGame(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
