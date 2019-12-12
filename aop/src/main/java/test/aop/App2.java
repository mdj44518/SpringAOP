package test.aop;

import test.inter.Cal2;
import test.inter.Calqu;

public class App2 {

	public static void main(String[] args) {
        // 두가지 계산 메서드 시간계산하기.
    	Calqu cal = new Cal2();
        long startTime = System.nanoTime();
        int result = cal.sum(100);
        long resultTime = System.nanoTime() - startTime;
        System.out.println("걸린시간 = " + resultTime);
        System.out.println("결과값 = " + result);
        
    }

}
