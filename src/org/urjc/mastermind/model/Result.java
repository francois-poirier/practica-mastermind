package org.urjc.mastermind.model;

public class Result {

	private static final int NUM = 4;

	private int deads;

	private int damaged;

	public Result(int deads, int damaged) {
		assert deads >= 0;
		assert damaged >= 0;
		this.deads = deads;
		this.damaged = damaged;
	}

	public boolean isWinner() {
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
