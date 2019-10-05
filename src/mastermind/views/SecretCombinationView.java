package mastermind.views;

import mastermind.models.SecretCombination;
import santaTecla.utils.ConsoleView;

public class SecretCombinationView extends ConsoleView {

	public SecretCombinationView() {
		super();
	}

	public void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}
}
