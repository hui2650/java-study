package ch_16;

public class TimeTable {
	
	public void showTable(int num) {
		for(int i = 1; i < 10; i++) {
			int result = num * i;
			System.out.println( num + "x" + i + "=" + result);
		}
	}
}
