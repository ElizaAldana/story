package view;


import controler.ControlStory;
import processing.core.PApplet;

public class Main extends PApplet {

	//Atributos
	ControlStory controler;
	int mouseX = 0;
	int mouseY = 1;
	
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
	background(255);
	controler.drawObject();
	controler.moveObjectBamboo();
	
	//coordinates
	text(mouseX+","+mouseY,mouseX,mouseY);
	}
	
	public void mousePressed() {
		
		if (mouseX > 397 && mouseY< -100) {
		    mouseX = 397;
		  } else {
		    mouseY = -100;
		  }
	}
}
