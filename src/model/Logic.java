package model;

import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	Elements bamboo;
	Elements ojisan;
	Elements basket;
	Elements bambookaguya;
	String[] textos;
	
	int posXBamboo;
	int posYBamboo;
	
	public Logic(PApplet app) {
		this.app = app;	
		bamboo = new Bamboo(posXBamboo,posYBamboo,app);
		posXBamboo = 397;
		posYBamboo = -100;
		ojisan = new Ojisan(app);
		basket = new Basket(app);
		bambookaguya = new Kaguya(app);
		textos = app.loadStrings("txt/cuento.txt");
	}
	
	public void drawObject() {
		for (int i = 0; i < textos.length; i++) {
			String[] words = textos[i].split(" ");
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals("bambu")) {
					bamboo.drawObject();
				}
				if(words[j].equals("Taketori")) {
					ojisan.drawObject();
				}
				if(words[j].equals("luna")) {
					basket.drawObject();
				}
				if(words[j].equals("joven")) {
					bambookaguya.drawObject();
				}
			}
		}
	}
	
	public void moveObjectBamboo() {
		posXBamboo = app.mouseX;
		posYBamboo = app.mouseY;
	}
	
}
