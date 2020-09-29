package view;


import controler.ControlStory;
import processing.core.PApplet;

public class Main extends PApplet {

	//Atributos
	ControlStory controler;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	
	public void settings () {
		size (1000,600);
	}
	
	
	public void setup () {	
	controler = new ControlStory(this);
	}
	
	public void draw () {
	background(0);
	controler.drawObject();
	
		
	//coordinates
	text(mouseX+","+mouseY,mouseX,mouseY);
	}
	
	public void mouseClicked() {
	controler.mouseClicked();
	}
	
		
}

