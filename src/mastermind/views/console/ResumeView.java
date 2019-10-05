package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.MessageView;
import santaTecla.utils.YesNoDialog;

public class ResumeView {

	public void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
