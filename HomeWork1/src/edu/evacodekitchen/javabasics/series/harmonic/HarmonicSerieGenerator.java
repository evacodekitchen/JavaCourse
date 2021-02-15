package edu.evacodekitchen.javabasics.series.harmonic;

public class HarmonicSerieGenerator{

	private int n;
	private float[] elements;

	public HarmonicSerieGenerator(int n) {
		this.n = n;
		elements = new float[n];
	}
		
	public float[] calculateElements() {
		for (int i = 0; i < n; i++) {
			elements[i] = calculateElementAt(i);
		}
		return elements;
	}

	protected float calculateElementAt(int index) {
		//TODO
		return 0f;
	}
}
