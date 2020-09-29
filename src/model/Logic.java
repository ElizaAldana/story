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
	int posXbasket;
	int posYbasket;
	int posXkaguya;
	int posYkaguya;
	int posXojisan;
	int posYojisan;
	
	public Logic(PApplet app) {
		this.app = app;	
		posXBamboo = 397;
		posYBamboo = -100;
		bamboo = new Bamboo(posXBamboo,posYBamboo,app);
		ojisan = new Ojisan(posXojisan, posYojisan, app);
		posXbasket = -250;
		posYbasket = 70;
		basket = new Basket(posXbasket,posYbasket, app);
		basket.setCanasta(0);
		System.out.println(basket.getCanasta());
		bambookaguya = new Kaguya(posXkaguya, posYkaguya, app);
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
				if(words[j].equals("canasta")) {
					basket.drawObject();
				}
				if(words[j].equals("joven")) {
					bambookaguya.drawObject();
				}
			}
		}
		
	
	}
	
	public void mouseClickedBasket() {
		switch (basket.getCanasta()) {
		case 0:
			if (app.mouseX > 20 && app.mouseY > 428  && app.mouseX < 170 && app.mouseY < 584) {
			basket.setCanasta(1);
			}
			break;
		case 1:
			if (app.mouseX > 20 && app.mouseY > 428  && app.mouseX < 170 && app.mouseY < 584) {
			basket.setCanasta(2);
			}
			break;
		}
	}
	
}
