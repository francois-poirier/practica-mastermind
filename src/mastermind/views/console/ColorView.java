package mastermind.views.console;

import mastermind.models.Color;
import santaTecla.utils.Console;

class ColorView extends mastermind.views.ColorView {

	public ColorView(Color color) {
		super(color);
	}
	
	public void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
