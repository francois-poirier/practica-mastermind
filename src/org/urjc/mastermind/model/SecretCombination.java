package org.urjc.mastermind.model;

import java.util.Collections;
import java.util.Random;

import org.urjc.mastermind.model.Result;
import org.urjc.mastermind.type.Color;

public class SecretCombination extends Combination {

	private static final String SECRET = "****";

	public SecretCombination() {
		for (Color color : Color.values()) {
			this.colors.add(color);
		}
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < Color.length() - getWith(); i++) {
			this.colors.remove(random.nextInt(this.colors.size()));
		}
		Collections.shuffle(this.colors);
	}

	public Result calculateResult(ProposedCombination proposedCombination) {
		int deads = 0;
		for (int i = 0; i < this.colors.size(); i++) {
			if (proposedCombination.contains(this.colors.get(i), i)) {
				deads++;
			}
		}
		int damaged = 0;
		for (Color color : this.colors) {
			if (proposedCombination.contains(color)) {
				damaged++;
			}
		}
		return new Result(deads, damaged - deads);
	}

	public void write() {
		System.out.println(SECRET);
	}
}
