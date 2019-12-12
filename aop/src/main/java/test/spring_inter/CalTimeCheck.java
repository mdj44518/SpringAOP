package test.spring_inter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalTimeCheck {
	
	@Around("CTC.aaa()")
	public int me(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.nanoTime();
	    int result = (Integer)joinPoint.proceed();
	    long resultTime = System.nanoTime() - startTime;
	    System.out.println("걸린시간 = " + resultTime);
	    System.out.println("결과값 = " + result);
	    return result;
	}
	
	

}
