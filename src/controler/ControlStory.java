package controler;

import model.Logic;
import processing.core.PApplet;

public class ControlStory {

	PApplet app;
	Logic logic;

	public ControlStory(PApplet app) {
	this.app = app;
	logic = new Logic(app);
	}
}