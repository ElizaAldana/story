package model;

import processing.core.PApplet;

public class Ojisan extends Elements {

	public Ojisan(int posX, int posY,PApplet app) {
		super(posX, posY, app);
	}

	public void drawObject() {
		app.image(señor, -150, -50);
}
}
