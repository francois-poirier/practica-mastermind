package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.views.MessageView;

public class SecretCombinationView {
	
	private Controller controller;
	
	public SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	public void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		MessageView.NEW_LINE.writeln();
	}
}
