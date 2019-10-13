package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import mastermind.controllers.MasterMindController;
import mastermind.types.Color;
import santaTecla.utils.ConsoleDelegate;

public class ProposedCombinationView extends ConsoleDelegate {
	
	private MasterMindController masterMindController;
	
	public ProposedCombinationView(MasterMindController masterMindController) {
		this.masterMindController = masterMindController;
	}
	
	public void write(int position) {
		for (Color color : this.masterMindController.getColors(position)) {
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
