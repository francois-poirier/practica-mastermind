package org.urjc.mastermind;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SecretCombination {

	private static final int NUM = 4;

	private List<Color> colors;

	public SecretCombination() {
		for (Color color : Color.values()) {
			this.colors.add(color);
		}
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < Color.length() - NUM; i++) {
			this.colors.remove(random.nextInt(this.colors.size()));
		}
		Collections.shuffle(this.colors);
	}

	public Result getResult(ProposeCombination proposedCombination) {
		int blacks = 0;
		for (int i = 0; i < this.colors.size(); i++) {
			if (proposedCombination.contains(this.colors.get(i), i)) {
				blacks++;
			}
		}
		int whites = 0;
		for (Color color : this.colors) {
			if (proposedCombination.contains(color)) {
				whites++;
			}
		}
		return new Result(blacks, whites - blacks);
	}
}
