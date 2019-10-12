package mastermind.views.console;

import mastermind.controllers.PlayController;

public class PlayView {

	public void interact(PlayController playController) {
		new PlayMenu(playController).execute();	
	}

}
