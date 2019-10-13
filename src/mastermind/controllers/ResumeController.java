package mastermind.controllers;

import mastermind.models.Session;

public abstract class ResumeController extends AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}

	public abstract void resume(boolean newGame);
	
	public abstract void isNewGame(boolean newGame);

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
