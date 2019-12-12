package test.aop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 두가지 계산 메서드 시간계산하기.
        long startTime = System.nanoTime();
        int result = sum1(100);
        long resultTime = System.nanoTime() - startTime;
        System.out.println("걸린시간 = " + resultTime);
        System.out.println("결과값 = " + result);
        
        
        
    }
    
    public static int sum1(int num) {
    	int sum = 0;
    	
    	for (int i = 1; i < num; i++) {
			sum += i;
		}
    	
    	return sum;
    }
    
    public static int sum2(int num) {
    	if (num == 1) return 1;
    	
    	return num + sum2(num - 1);
    }
}
