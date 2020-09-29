package model;

import processing.core.PApplet;

public class CutBamboo extends Elements {

	public CutBamboo(int posX, int posY, PApplet app) {
		super(posX, posY, app);

	}

	public void drawObject() {
		app.image(bamboocut, 20, 100);
}
}