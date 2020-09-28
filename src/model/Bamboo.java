package model;

import processing.core.PApplet;

public class Bamboo extends Elements {

	
	public Bamboo(PApplet app) {
		super(app);
	}
	
	public void drawObject() {
		app.image(background, 0,0);
		app.image(bamboo1, 397, -100);
		app.image(bamboo2, -20, -400);
		app.image(bamboo3, 150, -200);
		app.image(bamboo4, -200, -300);
		app.image(bamboo5, -50, -300);

	}

}
