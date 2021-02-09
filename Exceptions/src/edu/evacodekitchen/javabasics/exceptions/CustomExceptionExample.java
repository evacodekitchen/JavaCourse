package edu.evacodekitchen.javabasics.exceptions;

public class CustomExceptionExample {
	public static void main(String[] args) {
		System.out.println("Weight: " + new KitchenScale().measure());
	}

	public static class KitchenScale {
		public int measure() {
			int weight = getWeightFromSensor();
			if (weight > 5) {
				throw new WeightGreaterThan5KgException();
			}
			return weight;
		}

		private int getWeightFromSensor() {
			return 6;
		}

		public static class WeightGreaterThan5KgException extends RuntimeException {
//			public TooHeavyException(String message) {
//				super(message);
//			}
		}
	}
}
