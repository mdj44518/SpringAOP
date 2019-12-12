package test.aop;

import test.inter.Cal2;
import test.inter.CalTimeCheck;
import test.inter.Calqu;

public class App3 {

	public static void main(String[] args) {
        // 두가지 계산 메서드 시간계산하기.
    	Calqu cal = new CalTimeCheck(new Cal2());
    	cal.sum(100);
        
    }

}
