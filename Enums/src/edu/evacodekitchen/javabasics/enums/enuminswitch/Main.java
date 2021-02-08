package edu.evacodekitchen.javabasics.enums.enuminswitch;

public class Main {
	public static void main(String[] args) {
		sendParcel(ShippingMethod.MAGYAR_POSTA, 1000);
		sendParcel(ShippingMethod.GLS, 1000);
	}
	
	public static void sendParcel(ShippingMethod shippingMethod, int gramms) {
		System.out.println("Shipping method: " + shippingMethod + ", price: " + shippingMethod.getPrice(gramms));
		//...
	}
}
