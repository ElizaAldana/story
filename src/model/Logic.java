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
		posXBamboo = 397+259;
		posYBamboo = 250;
		bamboo = new Bamboo(posXBamboo,posYBamboo,app);
		posXojisan = 200;
		posYojisan = 400;
		ojisan = new Ojisan(posXojisan, posYojisan, app);
		posXbasket = -250;
		posYbasket = 70;
		basket = new Basket(posXbasket,posYbasket, app);
		basket.setCanasta(0);
		posXkaguya = 294;
		posYkaguya = -320;
		bambookaguya = new Kaguya(posXkaguya, posYkaguya, app);
		bambookaguya.setKaguya(0);
		textos = app.loadStrings("txt/cuento.txt");
		
	}
	
	public void drawObject() {
		for (int i = 0; i < textos.length; i++) {
			String[] words = textos[i].split(" ");
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals("bambu")) {
					bamboo.drawObject();
					if (app.mouseX > bamboo.getPosX()-73 && app.mouseY > bamboo.getPosY()-300  && app.mouseX < bamboo.getPosX()+73 && app.mouseY < bamboo.getPosY()+300) {
						bamboo.lightObject(); 
					}
				}
				if(words[j].equals("Taketori")) {
					ojisan.drawObject();
					if (app.mouseX > ojisan.getPosX()-150 && app.mouseY > ojisan.getPosY()-275  && app.mouseX < ojisan.getPosX()+100 && app.mouseY < ojisan.getPosY()+170) {
						ojisan.lightObject();
						} 
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
	
	public void mouseClickedKaguya() {
		switch (bambookaguya.getKaguya()) {
		case 0:
			if (app.mouseX > 524 && app.mouseY > 7  && app.mouseX < 625 && app.mouseY < 277) {
				bambookaguya.setKaguya(1);
			}
			break;
		case 1:
			if (app.mouseX > 524 && app.mouseY > 7  && app.mouseX < 625 && app.mouseY < 277) {
				bambookaguya.setKaguya(3);
			}
			break;
		}
	}
	public void mousePressedBamboo() {
		if (app.mouseX > bamboo.getPosX()-73 && app.mouseY > bamboo.getPosY()-300  && app.mouseX < bamboo.getPosX()+73 && app.mouseY < bamboo.getPosY()+300) {
		bamboo.setPosX(app.mouseX);
		bamboo.setPosY(app.mouseY);
		} 
	}
	
	public void mousePressedOjisan() {
		if (app.mouseX > ojisan.getPosX()-150 && app.mouseY > ojisan.getPosY()-275  && app.mouseX < ojisan.getPosX()+100 && app.mouseY < ojisan.getPosY()+170) {
		ojisan.setPosX(app.mouseX);
		ojisan.setPosY(app.mouseY);
		} 
	}
}
