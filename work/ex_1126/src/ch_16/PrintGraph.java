package ch_16;

public class PrintGraph {
	public void print(int ...nums) {
		
		for(int i = 0; i < nums.length; i++) {
			
			System.out.print( i + "의 갯수 : ");
			
			for(int j = 0; j < nums[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" (" + nums[i] + ")");
		}
	}
}
