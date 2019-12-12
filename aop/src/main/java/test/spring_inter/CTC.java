package test.spring_inter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class CTC {
	
	@Pointcut("execution(public int test..*(int))")
	public void aaa() {
	}

}
