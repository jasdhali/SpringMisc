package com.apress.springrecipes.bank;

public class SimpleInterestCalculator implements InterestCalculator {
	public double rate;

	public SimpleInterestCalculator() {

	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double calculate(double amount, double year) {
		if (amount < 0 || year < 0) {
			throw new IllegalArgumentException(
					"Amount or year must be positive.");
		}
		return amount * year * rate;
	}

}