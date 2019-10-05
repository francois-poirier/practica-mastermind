package mastermind.views;

import mastermind.models.Game;
import santaTecla.utils.YesNoDialog;

public class ResumeView {
	
	private Game game;

	public ResumeView(Game game) {
		this.game = game;
	}

	public boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}
}
