package org.urjc.mastermind.model;

import java.util.ArrayList;
import java.util.List;

import org.urjc.mastermind.type.Color;

public abstract class Combination {

	private static final int WITH = 4;

	protected List<Color> colors;

	protected Combination() {
		this.colors = new ArrayList<Color>();
	}

	protected int getWith() {
		return WITH;
	}
}
