package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Elements {

	PApplet app;
	PImage background;
	PImage señor;
	PImage señorsel;
	PImage bamboo1;
	PImage bamboo1sel;
	PImage bamboo2;
	PImage bamboo2sel;
	PImage bamboo3;
	PImage bamboo3sel;
	PImage bamboo4;
	PImage bamboo4sel;
	PImage bamboo5;
	PImage bamboo5sel;
	PImage basket;
	PImage basket1;
	PImage basket2;
	PImage basket3;
	PImage bambookaguya;
	PImage bamboocut;
	PImage bamboocutted;
	PImage bamboofinal;
	PImage finalpage;
	
		
	
	public Elements(PApplet app) {
		this.app = app;
	}
	
	public abstract void drawObject();
	
	public void loadImg() {
		this.basket = app.loadImage("img/basketempty.png");
		this.basket1 = app.loadImage("img/basket1.png");
		this.basket2 = app.loadImage("img/basket2.png");
		this.basket3 = app.loadImage("img/basketfull.png");
	}
	
	public void dibujameEsta() {
		app.image(basket, 0, 0);
	}
}
