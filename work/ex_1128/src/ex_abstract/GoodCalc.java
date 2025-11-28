package ex_abstract;

public class GoodCalc extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
	@Override
	public double average(int[] a) {
		int sum = 0;
		double avg = 0;
		
			for(int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			
		avg = sum/a.length;
		
		return avg;
	}
}
