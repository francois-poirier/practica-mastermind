package org.urjc.mastermind;

import java.util.List;

public class ProposeCombination {

	private static final int WIDTH = 4;
	private int with = WIDTH;

	private List<Color> colors;

	public ProposeCombination(List<Color> colors) {
		this.colors = colors;
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public List<Color> getColors() {
		return colors;
	}

	public int getWith() {
		return with;
	}

}
