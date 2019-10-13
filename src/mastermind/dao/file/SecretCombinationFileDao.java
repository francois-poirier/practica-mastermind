package mastermind.dao.file;

import java.io.BufferedReader;

import mastermind.models.SecretCombination;

public class SecretCombinationFileDao extends CombinationFileDao {

	public SecretCombinationFileDao(SecretCombination secretCombination) {
		super(secretCombination);
	}

	@Override
	public void load(BufferedReader bufferedReader) {
		this.combination.clearColors();
		super.load(bufferedReader);
	}
}
