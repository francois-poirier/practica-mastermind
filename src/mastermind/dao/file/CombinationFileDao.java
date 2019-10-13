package mastermind.dao.file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.dao.CombinationDao;
import mastermind.models.Combination;
import mastermind.types.Color;

public abstract class CombinationFileDao extends CombinationDao implements FileDao {
	
	public CombinationFileDao(Combination combination) {
		super(combination);
	}

	@Override
	public void save(FileWriter fileWriter) {
		try {
			for (Color color : this.combination.getColors()) {
				fileWriter.write(color.name() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(BufferedReader bufferedReader) {
		try {
			for (int i = 0; i < Combination.getWidth(); i++) {
				String color = bufferedReader.readLine();
				this.combination.addColor(Color.valueOf(color));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
