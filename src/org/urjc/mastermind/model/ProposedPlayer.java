package org.urjc.mastermind.model;

import java.util.ArrayList;
import java.util.List;

public class ProposedPlayer {

	private static final int MAX_ATTEMPTS = 10;

	private int attempts;
	private List<ProposedCombination> proposedCombinations;

	public ProposedPlayer() {
		this.clear();
	}

	public void clear() {
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.attempts = 0;
	}

	public void propose() {
		ProposedCombination proposedCombination = new ProposedCombination();
		proposedCombination.read();
		this.proposedCombinations.add(proposedCombination);
		attempts++;
	}

	public ProposedCombination getLastProposedCombination() {
		if (proposedCombinations != null && !proposedCombinations.isEmpty()) {
			return proposedCombinations.get(proposedCombinations.size() - 1);
		}
		return null;
	}

	public boolean isLooser() {
		return this.attempts == MAX_ATTEMPTS;
	}

	public boolean isWinner() {
		ProposedCombination lastProposedCombination = getLastProposedCombination();
		if (lastProposedCombination != null) {
			return lastProposedCombination.isWinner();
		}
		return false;
	}

	public void writeAttempts() {
		System.out.println(attempts + " attempt(s):");
	}

	public void writeProposedCombinations() {
		for (ProposedCombination pc : proposedCombinations) {
			pc.write();
		}
	}
}
