package mastermind.command;

import java.util.List;

import mastermind.controllers.PlayController;
import mastermind.models.Color;
import mastermind.models.Error;
import mastermind.views.MessageView;
import mastermind.views.console.ErrorView;
import mastermind.views.console.GameView;
import mastermind.views.console.ProposedCombinationView;

public class ProposeCommand extends Command {

	public ProposeCommand(PlayController playController) {
		super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
	}

	@Override
	public void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(this.playController).read();
			error = this.playController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		new GameView(this.playController);
	}

	@Override
	public boolean isActive() {
		return true;
	}

}