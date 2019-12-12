package test.spring_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test.spring.IocContaner;
import test.spring_inter.Cal1;
import test.spring_inter.Calqu;

public class MainApp {

	public static void main(String[] args) {
		// 프록시 자동.. 흠
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IocContaner.class);
		Calqu cal = ctx.getBean("cal1" ,Calqu.class);
		System.out.println(cal.sum(100));
		
		ctx.close();
		
		System.out.println("git 올리기 1");
		System.out.println("git 올리기 2");
		System.out.println("git 올리기 3");
	}

}
