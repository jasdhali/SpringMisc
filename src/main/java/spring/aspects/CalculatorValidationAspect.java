package spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;


@Aspect
@Order(1)
public class CalculatorValidationAspect {

	public CalculatorValidationAspect() {
		// TODO Auto-generated constructor stub
	}
	
	@Before("execution(* *.*(double, double))")
	public void validateBefore(JoinPoint joinpoint){
		for (Object arg : joinpoint.getArgs()){
			validate((Double)arg);
		}
	}

	private void validate(double a){
		if( a < 0 ){
			throw new IllegalArgumentException("Positive Numbers Only");
		}
	}
}
