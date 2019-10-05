package mastermind;


import mastermind.models.Game;
import mastermind.views.GameView;

public class Mastermind {
	
	private Game game;
	
	private GameView view;

	private Mastermind() {
		this.game = new Game();
		this.view = new GameView(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}
}
