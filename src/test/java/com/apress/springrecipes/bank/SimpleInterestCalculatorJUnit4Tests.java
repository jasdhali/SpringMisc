package com.apress.springrecipes.bank;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class SimpleInterestCalculatorJUnit4Tests extends TestCase {
	private InterestCalculator interestCalculator;

	public SimpleInterestCalculatorJUnit4Tests() {
	}

	public SimpleInterestCalculatorJUnit4Tests(String name) {
		super(name);
	}

	@Before
	protected void init() throws Exception {
		// super.setUp();
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate(0.05);
	}

	@Test
	public void calculate() {
		double interest = interestCalculator.calculate(10000, 2);
		assertEquals(interest, 1000.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalCalculate() {
		interestCalculator.calculate(-10000, 2);
	}
}