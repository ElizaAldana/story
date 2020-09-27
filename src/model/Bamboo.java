package model;

import processing.core.PApplet;

public class Bamboo extends Elements {

	
	public Bamboo(PApplet app) {
		super(app);
	}
	
	public void drawObject() {
		app.image(bamboo1, 20, 100);
	}

}
