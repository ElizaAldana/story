package model;

import processing.core.PApplet;

public class CutBamboo extends Elements {

	public CutBamboo(PApplet app) {
		super(app);

	}

	public void drawObject() {
		app.image(bamboocut, 20, 100);
}
}