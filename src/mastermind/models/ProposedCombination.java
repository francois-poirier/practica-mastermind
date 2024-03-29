package mastermind.models;

import java.util.ArrayList;
import java.util.List;

import mastermind.types.Color;

public class ProposedCombination extends Combination {

	public ProposedCombination() {
	}
	
	public ProposedCombination(List<Color> colors) {
		this.colors = colors;
	}

	public boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	public boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public ProposedCombination copy() {
		List<Color> colors = new ArrayList<Color>();
		for(Color color: this.colors) {
			colors.add(color);
		}
		return new ProposedCombination(colors);
	}

}
