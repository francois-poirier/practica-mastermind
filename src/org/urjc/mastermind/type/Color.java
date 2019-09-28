package org.urjc.mastermind.type;

public enum Color {
	
	RED('r'), 
	BLUE('b'), 
	YELLOW('y'), 
	GREEN('g'), 
	ORANGE('o'), 
	PURPLE('p');
	
    private final char color;
    
    private Color(char color) {
    	this.color = color;
    }

	public char getColor() {
		return color;
	}

	public static int length() {
		return Color.values().length;
	}
}
