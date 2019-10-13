package mastermind.command;

import java.util.List;

import mastermind.controllers.PlayController;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.views.console.ErrorView;
import mastermind.views.console.MasterMindView;
import mastermind.views.console.MessageView;
import mastermind.views.console.ProposedCombinationView;

public class ProposeCommand extends Command {

	public ProposeCommand(PlayController playController) {
		super(MessageView.PROPOSE.getMessage(), playController);
	}

	@Override
	public void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView((PlayController) this.acceptorController).read();
			error = ((PlayController) this.acceptorController).addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		new MasterMindView((PlayController) this.acceptorController);
	}

	@Override
	public boolean isActive() {
		return true;
	}

}