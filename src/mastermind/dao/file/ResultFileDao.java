package mastermind.dao.file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.dao.ResultDao;
import mastermind.models.Result;

public class ResultFileDao extends ResultDao implements FileDao {
	

	public ResultFileDao(Result result) {
		super(result);
	}

	@Override
	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(this.result.getBlacks() + "\n");
			fileWriter.write(this.result.getWhites() + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(BufferedReader bufferedReader) {
		try {
			this.result.setBlacks(Integer.parseInt(bufferedReader.readLine()));
			this.result.setWhites(Integer.parseInt(bufferedReader.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Result getResult() {
		return result;
	}

}
