package test.spring_inter;

import org.springframework.stereotype.Component;

@Component
public class Cal2 implements Calqu {
	
	public int sum(int num) {
    	if (num == 1) return 1;
    	
    	return num + sum(num - 1);
	}

}
