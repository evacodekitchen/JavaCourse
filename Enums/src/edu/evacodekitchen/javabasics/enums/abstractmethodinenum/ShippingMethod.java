package edu.evacodekitchen.javabasics.enums.abstractmethodinenum;

public enum ShippingMethod {

	MAGYAR_POSTA(2, 100) {
		@Override
		public Long getPrice(long weightInGramms) {
			if (weightInGramms < 1500) {
				return 945L;
			}
			return unitPrice * weightInGramms;
		}
	}, GLS(1, 150) {
		@Override
		public Long getPrice(long weightInGramms) {
			long price = unitPrice * weightInGramms;
			return price > 20000 ? 20000 : price;
		}
	}, FOXPOST(1, 60) {
		@Override
		public Long getPrice(long weightInGramms) {
			return 1100L;
		}
	};

	private Integer nrOfDaysWithinCarriedOut;
	protected Long unitPrice;

	ShippingMethod(int nrOfDaysWithinCarriedOut, long unitPrice) {
		this.nrOfDaysWithinCarriedOut = nrOfDaysWithinCarriedOut;
		this.unitPrice = unitPrice;
	}

	public abstract Long getPrice(long weightInGramms);

	public Integer getNrOfDaysWithinCarriedOut() {
		return nrOfDaysWithinCarriedOut;
	}

}
