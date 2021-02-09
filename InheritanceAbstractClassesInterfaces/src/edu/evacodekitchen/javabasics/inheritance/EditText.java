package edu.evacodekitchen.javabasics.inheritance;

public class EditText extends View {

	private String hint;

	public EditText(int id, int width, int height, String hint) {
		super(id, width, height);
		this.hint = hint;
	}

	@Override
	public void click() {
		super.click();
		// hide hint
	}

}
