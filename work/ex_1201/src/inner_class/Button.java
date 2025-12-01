package inner_class;

public class Button {
	
	interface OnClickListener{
		void onClick();
	}
	
	void setOnClickListener(OnClickListener listener) {
		listener.onClick();
	}       
}
