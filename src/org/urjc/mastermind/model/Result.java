package org.urjc.mastermind.model;

public class Result {

	private static final int NUM = 4;

	private int deads = 0;

	private int damaged = 0;

	Result(int deads, int damaged) {
		assert deads >= 0;
		assert damaged >= 0;
		this.deads = deads;
		this.damaged = damaged;
	}

	boolean isWinner() {
		return this.deads == NUM;
	}

	public int getDeads() {
		return this.deads;
	}

	public int getDamaged() {
		return this.damaged;
	}

	public void write() {
		System.out.println(" --> " + deads + " blacks and " + damaged + " whites");
	}
}
