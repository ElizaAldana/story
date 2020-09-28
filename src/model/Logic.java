package model;

import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	Elements bamboo;
	Elements ojisan;
	Elements basket;
	Elements bambookaguya;
	
	public Logic(PApplet app) {
		this.app = app;	
		bamboo = new Bamboo(app);
		ojisan = new Ojisan(app);
		basket = new Basket(app);
		bambookaguya = new Kaguya(app);
	}
	
	public void drawObject() {
		bamboo.drawObject();
		ojisan.drawObject();
		basket.drawObject();
		bambookaguya.drawObject();
	}
	
}
