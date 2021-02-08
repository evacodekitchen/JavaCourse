package edu.evacodekitchen.javabasics.enums;

public enum ShippingMethod {

	MAGYAR_POSTA(2, 100), GLS(1, 150), FOXPOST(1, 60);

	private Integer nrOfDaysWithinCarriedOut;
	private Long unitPrice;

	ShippingMethod(int nrOfDaysWithinCarriedOut, long unitPrice) {
		this.nrOfDaysWithinCarriedOut = nrOfDaysWithinCarriedOut;
		this.unitPrice = unitPrice;
	}

	public Long getPrice(long weightInGramms) {
		return unitPrice * weightInGramms;
	}

	public Integer getNrOfDaysWithinCarriedOut() {
		return nrOfDaysWithinCarriedOut;
	}

}
