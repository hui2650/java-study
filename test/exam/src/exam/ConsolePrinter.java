package exam;

public class ConsolePrinter implements Printable{
	@Override
	public void print(String message) {
		System.out.println(message);
	}
}
