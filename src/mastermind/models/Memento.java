package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	
	private List<ProposedCombination> proposedCombinations;

	private List<Result> results;

	private int attempts;

	public Memento(int attempts) {
		this.attempts = attempts;
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
	}

	public void set(ProposedCombination proposedCombination, Result result) {
		this.proposedCombinations.add(proposedCombination);
		this.results.add(result);
	}
	
	public ProposedCombination getProposedCombination(int position){
		return this.proposedCombinations.get(position);
	}
	
	public Result getResult(int position){
		return this.results.get(position);
	}
	
	public int getSize() {
		return proposedCombinations.size();
	}
	
	public int getAttempts(){
		return this.attempts;
	}
}
