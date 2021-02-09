package edu.evacodekitchen.javabasics.abstractclasses;

public class EditText extends View {

	private String hint;

	public EditText(int id, int width, int height, String hint) {
		super(id, width, height);
		this.hint = hint;
	}

	@Override
	public void click() {
		// hide hint
	}

}
