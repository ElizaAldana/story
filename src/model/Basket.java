package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Basket extends Elements {

	public Basket(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		canasta = 0;
	}
	
	public void drawObject() {
	app.imageMode(PConstants.CORNER);

	switch (canasta) {
	case 0:
		app.image(basketempty, this.posX, this.posY);
		
		break;
	case 1:
		app.image(basket1, this.posX, this.posY);
		
		break;
	case 2:
		app.image(basket3, this.posX, this.posY);
		
		break;

	}
	}
	public void lightObject() {
		
	}

	
}
