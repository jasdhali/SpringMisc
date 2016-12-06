package com.apress.springrecipes.bank;

import junit.framework.TestCase;

public class SimpleInterestCalculatorJUnit38Tests extends TestCase {
	private InterestCalculator interestCalculator;
	public SimpleInterestCalculatorJUnit38Tests() {
		// TODO Auto-generated constructor stub
	}

	public SimpleInterestCalculatorJUnit38Tests(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		//super.setUp();
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate( 0.05 );
	}
	
	public void testCalculator(){
		double interest = interestCalculator.calculate(10000, 2);
		assertEquals( interest , 1000.0);
	}
	
	public void testIllegalCalculator(){
		try {
			interestCalculator.calculate(-10000, 2);
			fail("No exception on illegal argument");
		} catch (IllegalArgumentException e) 
		{ 
			
		}
	}
}
