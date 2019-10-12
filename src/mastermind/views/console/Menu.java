package mastermind.views.console;

import java.util.ArrayList;

import mastermind.command.Command;
import mastermind.utils.Range;
import santaTecla.utils.ConsoleDelegate;

public abstract class Menu extends ConsoleDelegate {
	
	private ArrayList<Command> commandList;

	public Menu() {
		this.commandList = new ArrayList<Command>();
	}

	public void execute() {
		ArrayList<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < this.commandList.size(); i++) {
			if (this.commandList.get(i).isActive()) {
				commands.add(this.commandList.get(i));
			}
		}
		boolean error;
		int option;
		do {
			error = false;
			this.console.writeln();
			MessageView.OPTION.writeln();
			for (int i = 0; i < commands.size(); i++) {
				this.console.writeln((i + 1) + ") " + commands.get(i).getTitle());
			}
			option = this.console.readInt("") - 1;
			if (!new Range(0, commands.size()-1).contains(option)) {
				error = true;
			} 				
		} while (error);
		commands.get(option).execute();
	}

	protected void addCommand(Command command) {
		this.commandList.add(command);
	}
}
