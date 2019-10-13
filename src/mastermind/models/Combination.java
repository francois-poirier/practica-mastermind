package mastermind.models;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void save(FileWriter fileWriter) {
		try {
			for (Color color : this.colors) {
				fileWriter.write(color.name() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			for (int i = 0; i < Combination.getWidth(); i++) {
				String color = bufferedReader.readLine();
				this.colors.add(Color.valueOf(color));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
