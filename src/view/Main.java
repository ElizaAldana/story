package view;

import controler.ControlStory;
import processing.core.PApplet;

public class Main extends PApplet {

	//Atributos
	ControlStory control;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	
	public void settings () {
		size (1000,600);
		control = new ControlStory(this);
	}
	
	
	public void setup () {
		
	}
	
	public void draw () {
		
	}
}
