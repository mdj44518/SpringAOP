package test.inter;

public class CalTimeCheck implements Calqu {
	
	private Calqu cal;
	
	public CalTimeCheck(Calqu cal) {
		this.cal = cal;
	}

	public int sum(int num) {
		long startTime = System.nanoTime();
        int result = cal.sum(num);
        long resultTime = System.nanoTime() - startTime;
        System.out.println("걸린시간 = " + resultTime);
        System.out.println("결과값 = " + result);
        return result;
	}

}
