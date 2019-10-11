package mastermind.controllers;

import mastermind.models.Session;

public abstract class AcceptorController extends Controller {

	public AcceptorController(Session session) {
		super(session);
	}

	public abstract void accept(ControllersVisitor controllersVisitor);

}
