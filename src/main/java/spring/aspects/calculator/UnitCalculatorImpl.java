package spring.aspects.calculator;

public class UnitCalculatorImpl implements UnitCalculator {

	public UnitCalculatorImpl() {
	}

	public double kilogramToPound(double kilogram) {
		double pound = kilogram*2.25;
		System.out.println(kilogram + "  Kilogram = "+ pound + " pound");
		return pound;
	}

	public double kilometerToMile(double kilometer) {
		double mile = kilometer*0.62;
		System.out.println(kilometer + "  kilometer = "+ mile + " mile");
		return mile;
	}
	
}
