package mastermind.dao.file;

import mastermind.models.ProposedCombination;

public class ProposedCombinationFileDao extends CombinationFileDao {

	public ProposedCombinationFileDao(ProposedCombination proposedCombination) {
		super(proposedCombination);
	}

	public ProposedCombination getProposedCombination() {
		return (ProposedCombination)combination;
	}

}
