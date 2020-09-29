package model;

import processing.core.PApplet;

public class Kaguya extends Elements {


	public Kaguya(int posX, int posY, PApplet app) {
	super(posX, posY, app);
	}

	public void drawObject() {
		app.image(bambookaguya, 294, -320);
}

}
