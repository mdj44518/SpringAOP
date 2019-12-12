package test.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import test.spring_inter.Cal1;
import test.spring_inter.Calqu;

@Configuration
@ComponentScan(basePackages = "test.spring_inter")
@EnableAspectJAutoProxy
public class IocContaner {
	
}
