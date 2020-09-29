package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Kaguya extends Elements {


	public Kaguya(int posX, int posY, PApplet app) {
	super(posX, posY, app);
	kaguya = 0;
	}

	public void drawObject() {
		app.imageMode(PConstants.CORNER);

		switch (kaguya) {
		case 0:
			app.image(bambookaguya, this.posX, this.posY);
			
			break;
		case 1:
			app.image(bamboocut, this.posX, this.posY);
			
			break;
		case 2:
			app.image(bamboocutted, this.posX, this.posY);
			
			break;
			
		case 3:
			app.image(bamboofinal, this.posX, this.posY);
			
			break;
		}
	}
	public void lightObject() {
		
	}

}
