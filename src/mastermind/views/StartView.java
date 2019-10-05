package mastermind.views;

import santaTecla.utils.ConsoleView;

public class StartView extends ConsoleView  {

	public void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}