package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import mastermind.controllers.ProposalController;
import mastermind.models.Color;
import mastermind.views.MessageView;
import santaTecla.utils.ConsoleDelegate;

public class ProposedCombinationView extends ConsoleDelegate {
	
	private ProposalController proposalController;
	
	public ProposedCombinationView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}
	
	public void write(int position) {
		for (Color color : this.proposalController.getColors(position)) {
			new ColorView(color).write();
		}
	}

	public List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}
