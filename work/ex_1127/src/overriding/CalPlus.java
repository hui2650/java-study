package overriding;

public class CalPlus extends Calculator2 {
	
	@Override
	public int getResult(int n1, int n2) {
		return n1 + n2;
	}
	
}
