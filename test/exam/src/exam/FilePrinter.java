package exam;

public class FilePrinter implements Printable{
	@Override
	public void print(String message) {
		System.out.println("파일에 출력: [" + message + "]");
		
	}
}
