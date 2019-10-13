package mastermind.dao.file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.dao.GameDao;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;

public class GameFileDao extends GameDao implements FileDao {

	private SecretCombinationFileDao secretCombinationFileDao;

	public GameFileDao(Game game) {
		super(game);
		this.secretCombinationFileDao = new SecretCombinationFileDao(this.game.getSecretCombination());
	}

	@Override
	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(this.game.getAttempts() + "\n");
			this.secretCombinationFileDao.save(fileWriter);
			for (int i = 0; i < this.game.getAttempts(); i++) {
				new ProposedCombinationFileDao(this.game.getProposedCombination(i)).save(fileWriter);
				new ResultFileDao(this.game.getResult(i)).save(fileWriter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(BufferedReader bufferedReader) {
		try {
			this.game.setAttempts(Integer.parseInt(bufferedReader.readLine()));
			this.secretCombinationFileDao.load(bufferedReader);
			for (int i = 0; i < this.game.getAttempts(); i++) {
				ProposedCombinationFileDao proposedCombinationFileDao = new ProposedCombinationFileDao(
						new ProposedCombination());
				proposedCombinationFileDao.load(bufferedReader);
				this.game.addProposedCombination(proposedCombinationFileDao.getProposedCombination());
				ResultFileDao resultFileDao = new ResultFileDao(new Result());
				resultFileDao.load(bufferedReader);
				this.game.addResult(resultFileDao.getResult());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
