package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Bamboo extends Elements {

	
	public Bamboo(int posX,int posY, PApplet app) {
		super(posX, posY,app);
	}
	
	public void drawObject() {
		app.imageMode(PConstants.CORNER);
		app.image(background, 0,0);
		app.imageMode(PConstants.CENTER);
		app.image(bamboomov, posX, posY);
		app.imageMode(PConstants.CORNER);
		app.image(bamboo2, -20, -400);
		app.image(bamboo3, 150, -200);
		app.image(bamboo4, -200, -300);
		app.image(bamboo5, -50, -300);

	}

}
