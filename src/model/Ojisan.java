package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Ojisan extends Elements {

	public Ojisan(int posX, int posY,PApplet app) {
		super(posX, posY, app);
	}

	public void drawObject() {
		app.imageMode(PConstants.CENTER);
		app.image(se�or, posX, posY);
}
	public void lightObject() {
		app.imageMode(PConstants.CENTER);
		app.image(se�orsel, posX+5, posY-10);
	}

}
