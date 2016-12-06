package spring.aspects.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aspects.calculator.ArithmeticCalculator;

public class ArithmeticCalcClient {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspects/aspect-beans-annotations.xml");
		//LocalEmpDBUtility dbUtility = (LocalEmpDBUtility)applicationContext.getBean( "localEmpDBUtility");
		
		/*if( dbUtility!=null){
			try {
				Connection conn = dbUtility.getConn();
				dbUtility.createEmployere(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		if( applicationContext != null ){
			ArithmeticCalculator arithCalc = (ArithmeticCalculator)applicationContext.getBean("arithmeticCalculator");
			//arithCalc.add(1, 2);			
			arithCalc.div(0, 0);
			//arithCalc.mul(2, 3);
			//arithCalc.sub(4, 2);
			}
		}
}