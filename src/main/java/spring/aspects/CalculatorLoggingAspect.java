package spring.aspects;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CalculatorLoggingAspect {
	private Log log = LogFactory.getLog(this.getClass());
	//@Before("execution(* *.*(..))")
	//public void logBefore(JoinPoint joinPoint) {		
		//log.info("The method "+ joinPoint.getSignature().getName() + " () begins with " + Arrays.toString( joinPoint.getArgs()));
		//Object class = joinPoint.getClass();
	/*		String kind = joinPoint.getKind();
		Signature signature = joinPoint.getSignature();
		System.out.println("kind ==> " + kind );
		System.out.println("signature ==> " + signature );
		if( signature!=null ){
			String methodName = signature.getName();
			int numMods = signature.getModifiers();
			Class decTyp = signature.getDeclaringType();
			System.out.println(  " methodname = > " + methodName );
			System.out.println(  " numMods = > " + numMods );
			System.out.println(  " decTyp.getName() = > " + decTyp.getName() );
			System.out.println(  " DeclaringType = > " + decTyp.getSimpleName() );
			Annotation[] annotatations = decTyp.getAnnotations();
			for(int i = 0; i < annotatations.length; i++) {
				Annotation annotation = annotatations[i];
				System.out.println(  "Annotation.toString() = > " + annotation.toString() );
			}
		}*/
	//}
	
	/*@After("execution(* *.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.info("The method "+ joinPoint.getSignature().getName() + " () ends");
	}*/
	
	@Around("execution(* *.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("The method "+ joinPoint.getSignature().getName() + " () begins with " + Arrays.toString(joinPoint.getArgs()));
		try{
			Object result = joinPoint.proceed();
			log.info( "The method "+ joinPoint.getSignature().getName() + " () ends with " + result );
			return result;
		}
		catch(IllegalArgumentException exception){
			log.error( "Illegal argument " + Arrays.toString( joinPoint.getArgs() ) + " in " + joinPoint.getSignature().getName() + "()");
			throw exception;
		}
	}
	/*@AfterThrowing( pointcut = "execution(* *.*(..))" ,throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint,Throwable e) {
		log.info("An exception " + e + " has been thrown in " + joinPoint.getSignature().getName() + " () ");
	}*/	
	
}