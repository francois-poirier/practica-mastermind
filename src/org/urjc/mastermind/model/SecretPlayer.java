package org.urjc.mastermind.model;

public class SecretPlayer {

	private ProposedPlayer proposedPlayer;
	private SecretCombination secretCombination;

	public SecretPlayer(final ProposedPlayer proposedPlayer) {
		this.proposedPlayer = proposedPlayer;
	}

	public void prepare() {
		this.secretCombination = new SecretCombination();
	}

	public void answer() {
		ProposedCombination lastProposedCombination = proposedPlayer.getLastProposedCombination();
		Result result = secretCombination.calculateResult(lastProposedCombination);
		lastProposedCombination.setResult(result);
	}

	public void write() {
		secretCombination.write();
	}
}
