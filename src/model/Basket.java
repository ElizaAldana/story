package model;

import processing.core.PApplet;

public class Basket extends Elements {

	public Basket(PApplet app) {
		super(app);
	}
	
	public void drawObject() {
		app.image(basket, 20, 100);
	}

}
