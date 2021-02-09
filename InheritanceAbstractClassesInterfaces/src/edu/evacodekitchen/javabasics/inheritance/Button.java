package edu.evacodekitchen.javabasics.inheritance;

public class Button extends View {

	private String text;

	public Button(int id, int width, int height, String text) {
		super(id, width, height);
		this.text = text;
	}

	@Override
	public void click() {
		super.click();
		// highlight text
	}

}
