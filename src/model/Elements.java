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
		this.bamboo1 = app.loadImage("img/bambu1.png");
		this.bamboo1sel = app.loadImage("img/bambu1sel.png");
		this.bamboo2 = app.loadImage("img/bambu2.png");
		this.bamboo2sel = app.loadImage("img/bambu2sel.png");
		this.bamboo3 = app.loadImage("img/bambu3.png");
		this.bamboo3sel = app.loadImage("img/bambu3sel.png");
		this.bamboo4 = app.loadImage("img/bambu4.png");
		this.bamboo4sel = app.loadImage("img/bambu4sel.png");
		this.bamboo5 = app.loadImage("img/bambu4.png");
		this.bamboo5sel = app.loadImage("img/bambu5sel.png");
		this.señor = app.loadImage("img/señorr.png");
		this.señorsel = app.loadImage("img/señorsel.png");
		this.background = app.loadImage("img/CampoBambu.png");
		this.finalpage = app.loadImage("img/finalPage.png");
	}
	
	public void paint() {
		app.image(basket, 0, 0);
	}
}
