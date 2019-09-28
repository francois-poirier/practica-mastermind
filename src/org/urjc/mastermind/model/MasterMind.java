package org.urjc.mastermind.model;

import java.util.Scanner;

public class MasterMind {

	private static final String QUESTION = "Do you want to continue? (s/n):";
	private static final String LOST_MESSAGE = "You've lost!!! :-(";
	private static final String WIN_MESSAGE = "You've won!!! ;-)";
	private static final String TITLE = "----- MASTERMIND -----";
	private static final char YES = 's';

	private ProposedPlayer proposedPlayer;
	private SecretPlayer secretPlayer;
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MasterMind masterMind = new MasterMind();
		masterMind.play();
		System.exit(0);
	}

	public void play() {

		do {
			writeTitle();
			proposedPlayer = new ProposedPlayer();
			secretPlayer = new SecretPlayer(proposedPlayer);
			secretPlayer.prepare();
			secretPlayer.write();
			while ((!proposedPlayer.isLooser()) && (!proposedPlayer.isWinner())) {
				proposedPlayer.propose();
				secretPlayer.answer();
				proposedPlayer.writeAttempts();
				secretPlayer.write();
				proposedPlayer.writeProposedCombinations();
			}
			if (proposedPlayer.isWinner()) {
				System.out.println(WIN_MESSAGE);
			} else {
				System.out.println(LOST_MESSAGE);
			}
			System.out.print(QUESTION);
		} while (playAgain());

	}

	public boolean playAgain() {
		return scanner.nextLine().charAt(0) == YES;
	}

	private void writeTitle() {
		System.out.println(TITLE);
	}
}
