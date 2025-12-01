package ex_interface;

//import ex_interface.MessageSender;

public class NotificationService {
	 void notifyUser(MessageSender sender, String message) {
		 // 어떤 종류의 전달방식이 오더라도 send 메서드를 사용한다
		 sender.send(message);
	 }
}
