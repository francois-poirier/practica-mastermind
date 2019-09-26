package org.urjc.mastermind;

public class Result {

	private static final int NUM = 4;

	private int blacks = 0;

	private int whites = 0;

	Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;
		this.blacks = blacks;
		this.whites = whites;
	}

	boolean isWinner() {
		return this.blacks == NUM;
	}

	int getBlacks() {
		return this.blacks;
	}

	int getWhites() {
		return this.whites;
	}
}
