package spring.aspects.calculator;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	public ArithmeticCalculatorImpl() {
	}

	public double add(double a, double b) {
		double result = a + b;
		return result;
	}

	public double sub(double a, double b) {
		double result = a - b;
		return result;
	}

	public double mul(double a, double b) {
		double result = a * b;
		return result;
	}

	public double div(double a, double b)  {
		/*if( b<0 ) 
				throw new Exception("Divisor can not be less than zero.");*/
		double result = a / b;
		return result;
	}
}