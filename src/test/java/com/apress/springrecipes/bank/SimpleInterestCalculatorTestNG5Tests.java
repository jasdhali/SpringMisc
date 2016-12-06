package com.apress.springrecipes.bank;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleInterestCalculatorTestNG5Tests {
	private InterestCalculator interestCalculator;
	
	public SimpleInterestCalculatorTestNG5Tests() {
	}
	
	@BeforeMethod
	public void init() throws Exception {
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate(0.05);
	}

	@Test(dataProvider = "legal")
	public void calculate(double amount,double year,double result) {
		double interest = interestCalculator.calculate(amount, year);
		assertEquals(interest, result);
	}
	
	@Test(dataProvider = "illegal", expectedExceptions = IllegalArgumentException.class)
	public void illegalCalculate(double amount,double year,double result) {
		interestCalculator.calculate(amount, year);
	}

	@DataProvider( name = "legal")
	public Object[][] createLegalInterestParameters(){
		return new Object[][] { new Object[]{10000, 2 , 1000.2}};
	}

	@DataProvider(name = "illegal")
	public Object[][] createIlllegalInterestParameters(){
		System.out.println("createIlllegalInterestParameters....");
		return new Object[][] { new Object[]{ -10000, 2 } , 
				new Object[]{ 10000, -2 }, 
				new Object[]{ -10000, -2 }};
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void illegalCalculate() {
		interestCalculator.calculate(-10000, 2);
	}
}
