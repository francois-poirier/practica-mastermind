package mastermind.dao;

import mastermind.models.Result;

public class ResultDao {

	protected Result result;

	public ResultDao(Result result) {
		this.result = result;
	}
	
	public Result getResult() {
		return this.result;
	}

}
