package mastermind.models;

import java.util.ArrayList;
import java.util.List;

import mastermind.types.Color;

public abstract class Combination {
	
	private static final int WIDTH = 4;

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	public static int getWidth() {
		return Combination.WIDTH;
	}

	public List<Color> getColors() {
		return colors;
	}
	
	public void addColor(Color color) {
		this.colors.add(color);
	}
	
	public void clearColors() {
		this.colors.clear();
	}
	
}
