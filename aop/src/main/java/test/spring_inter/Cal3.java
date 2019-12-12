package test.spring_inter;

import org.springframework.stereotype.Component;

@Component
public class Cal3 {
	
	public long sum(int num) {
    	if (num == 1) return 1;
    	
    	return num + sum(num - 1);
	}

}
