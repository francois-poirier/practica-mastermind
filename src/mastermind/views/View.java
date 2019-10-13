package mastermind.views;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ControllersVisitor;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.SaveController;
import mastermind.controllers.StartController;
import mastermind.views.console.PlayView;
import mastermind.views.console.ResumeView;
import mastermind.views.console.SaveView;
import mastermind.views.console.StartView;

public class View implements ControllersVisitor {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;
	private SaveView saveView;
	
	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

	@Override
	public void visit(SaveController saveController) {
		this.saveView.interact(saveController);
	}

}
