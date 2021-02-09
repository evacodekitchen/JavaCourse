package edu.evacodekitchen.javabasics.abstractclasses;

public abstract class View{
	
	private int id;
	private int width;
	private int height;
	
	public View(int id, int width, int height) {
		this.id = id;
		this.width = width;
		this.height = height;
	}
	
	public abstract void click();

}
