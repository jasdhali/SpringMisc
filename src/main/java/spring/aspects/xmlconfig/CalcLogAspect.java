package spring.aspects.xmlconfig;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class CalcLogAspect {

	private Log log = LogFactory.getLog(this.getClass());

	public CalcLogAspect() {
		System.out.println("public CalculatorLoggingAspect() Instantiating.");
	}

	public void logBefore(JoinPoint joinPoint) {
		log.info("The method " + joinPoint.getSignature().getName()
				+ " () begins with " + Arrays.toString(joinPoint.getArgs()));
		String kind = joinPoint.getKind();
		Signature signature = joinPoint.getSignature();
		System.out.println("kind ==> " + kind);
		System.out.println("signature ==> " + signature);
		/*		
 		if (signature != null) {
			String methodName = signature.getName();
			int numMods = signature.getModifiers();
			Class decTyp = signature.getDeclaringType();
			System.out.println(" methodname = > " + methodName);
			System.out.println(" numMods = > " + numMods);
			System.out.println(" decTyp.getName() = > " + decTyp.getName());
			System.out.println(" DeclaringType = > " + decTyp.getSimpleName());
			Annotation[] annotatations = decTyp.getAnnotations();
			for (int i = 0; i < annotatations.length; i++) {
				Annotation annotation = annotatations[i];
				System.out.println("Annotation.toString() = > "
						+ annotation.toString());
			}
		}*/
	}
	
	public void logAfter(JoinPoint joinPoint) {
		log.info("The method " + joinPoint.getSignature().getName()
				+ " () ends");
	}
}