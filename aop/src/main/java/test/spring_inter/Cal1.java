package test.spring_inter;

import org.springframework.stereotype.Component;

@Component
public class Cal1 implements Calqu {
	
	public int sum(int num) {
    	int sum = 0;
    	
    	for (int i = 1; i < num; i++) {
			sum += i;
		}
    	
    	return sum;
	}

}
