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
	if (mousePressed) {
		controler.mousePressed();
	}
		
	//coordinates
	text(mouseX+","+mouseY,mouseX,mouseY);
	}
	
	public void mouseClicked() {
	controler.mouseClicked();
	}
	
	public void mousePressed() {
	controler.mousePressed();
	a = a+1;
	System.out.println(a);
	}
	
	int a;
	
}

