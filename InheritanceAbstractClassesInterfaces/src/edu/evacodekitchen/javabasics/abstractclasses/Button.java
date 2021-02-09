package edu.evacodekitchen.javabasics.abstractclasses;

public class Button extends View {

	private String text;

	public Button(int id, int width, int height, String text) {
		super(id, width, height);
		this.text = text;
	}

	@Override
	public void click() {
		// highlight text
	}

}
