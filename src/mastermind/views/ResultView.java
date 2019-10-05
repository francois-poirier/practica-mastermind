package mastermind.views;

import mastermind.models.Result;
import santaTecla.utils.ConsoleView;

public class ResultView extends ConsoleView {
	
	private Result result;

	public ResultView(Result result) {
		this.result = result;
	}

	public void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}
}
