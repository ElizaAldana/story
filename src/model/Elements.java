package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Elements {

	//Images
	//PImage campo; prueba
	
	PApplet app;
	PImage background;
	PImage señor;
	PImage señorsel;
	PImage bamboomov;
	PImage bamboo1sel;
	PImage bamboo2;
	PImage bamboo3;
	PImage bamboo4;
	PImage bamboo5;
	PImage basketempty;
	PImage basket1;
	PImage basket2;
	PImage basket3;
	PImage bambookaguya;
	PImage bamboocut;
	PImage bamboocutted;
	PImage bamboofinal;
	PImage finalpage;
	
	int posX;
	int posY;
	int canasta;
	int kaguya;
	
	public Elements(int posX, int posY, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.canasta = 0;
		this.kaguya = 0;
		loadImg();
	}
	
	public int getKaguya() {
		return kaguya;
	}

	public void setKaguya(int kaguya) {
		this.kaguya = kaguya;
	}

	public int getCanasta() {
		return canasta;
	}

	public void setCanasta(int canasta) {
		this.canasta = canasta;
	}

	public abstract void drawObject();
	
	public void loadImg() {
		//para las coordenadas
		//this.campo = app.loadImage("img/CampoBambuf.jpg");

		
		this.basketempty = app.loadImage("img/basketempty.png");
		this.basket1 = app.loadImage("img/basket1.png");
		this.basket2 = app.loadImage("img/basket2.png");
		this.basket3 = app.loadImage("img/basketfull.png");
		this.bamboomov = app.loadImage("img/bambu1.png");
		this.bamboo1sel = app.loadImage("img/bambu1sel.png");
		this.bamboo2 = app.loadImage("img/bambu2.png");
		this.bamboo3 = app.loadImage("img/bambu3.png");
		this.bamboo4 = app.loadImage("img/bambu4.png");
		this.bamboo5 = app.loadImage("img/bambu5.png");
		this.señor = app.loadImage("img/señorr.png");
		this.señorsel = app.loadImage("img/señorsel.png");
		this.background = app.loadImage("img/CampoBambu.png");
		this.finalpage = app.loadImage("img/finalPage.png");
		this.bambookaguya = app.loadImage("img/bambukaguya.png");
		this.bamboocut = app.loadImage("img/bambucut.png");
		this.bamboocutted = app.loadImage("img/bambucutted.png");
		this.bamboofinal = app.loadImage("img/kaguyahime.png");
	}
	
}
