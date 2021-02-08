package edu.evacodekitchen.javabasics.enums.enuminswitch;

public enum ShippingMethod {

	MAGYAR_POSTA(2, 100), GLS(1, 150), FOXPOST(1, 60);

	private Integer nrOfDaysWithinCarriedOut;
	private Long unitPrice;

	ShippingMethod(int nrOfDaysWithinCarriedOut, long unitPrice) {
		this.nrOfDaysWithinCarriedOut = nrOfDaysWithinCarriedOut;
		this.unitPrice = unitPrice;
	}

	public Long getPrice(long weightInGramms) {
		switch (this) {
		case MAGYAR_POSTA:
			if (weightInGramms < 1500) {
				return 945L;
			}
			return unitPrice * weightInGramms;
		case GLS:
			long price = unitPrice * weightInGramms;
			return price > 20000 ? 20000 : price;
		case FOXPOST:
			return 1100L;
		}
		return null;

	}

	public Integer getNrOfDaysWithinCarriedOut() {
		return nrOfDaysWithinCarriedOut;
	}

}
