package org.urjc.mastermind.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.urjc.mastermind.type.Color;

public class ProposedCombination extends Combination {

	private static final String WRONG_COLORS = "Wrong colors, they must be: rbygop";
	private static final String PROPOSED_COMBINATION = "Propose a combination: ";
	public static final char[] INITIALS = { 'r', 'b', 'y', 'g', 'o', 'p' };

	private Scanner scanner = new Scanner(System.in);
	private List<Color> colors;
	private Result result;

	public void read() {
		String characters = null;
		boolean ok = false;
		do {
			System.out.print(PROPOSED_COMBINATION);
			characters = this.scanner.nextLine();
			ok = checkInput(characters);
			if (!ok) {
				System.out.println(WRONG_COLORS);
			}

		} while (!ok);

		this.colors = new ArrayList<Color>();
		for (int i = 0; i < characters.length(); i++) {
			colors.add(getColor(characters.charAt(i)));
		}
	}

	private Color getColor(char character) {
		for (int i = 0; i < INITIALS.length; i++) {
			if (INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}

	private boolean checkInput(String input) {
		if ((input != null) && (input.length() == getWith())) {
			String str = String.valueOf(INITIALS);
			for (int i = 0; i < input.length();) {
				char character = input.charAt(i++);
				if (str.indexOf(character) == -1) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public boolean isWinner() {
		return result.isWinner();
	}

	public List<Color> getColors() {
		return colors;
	}

	public void write() {
		String input = "";
		for (int i = 0; i < colors.size(); i++) {
			Color color = colors.get(i);
			input += color.getColor();
		}
		System.out.print(input);
		result.write();
	}
}
