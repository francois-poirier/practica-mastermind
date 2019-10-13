package mastermind.models;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class Result {

	private int blacks = 0;
	private int whites = 0;

	public Result() {
		
	}
	
	public Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;
		this.blacks = blacks;
		this.whites = whites;
	}

	public boolean isWinner() {
		return this.blacks == Combination.getWidth();
	}

	public int getBlacks() {
		return this.blacks;
	}

	public int getWhites() {
		return this.whites;
	}

	public Result copy() {
		return new Result(this.blacks, this.whites);
	}

	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(this.blacks + "\n");
			fileWriter.write(this.whites + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			this.blacks = Integer.parseInt(bufferedReader.readLine());
			this.whites = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
