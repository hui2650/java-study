package package1;

class A {
	
	public int field1;
	int field2;
	private int field3;
	
	public void method1() {
		
	}
	 void method2() {
		
	}
	private void method3() {
		
	}
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	}

	//A클래스의 접근 제한은 defalut로 설정이 되어있고
	//같은 패키지 내에서만 접근이 가능하다.
	
	public A(boolean b) {  // 어디서나 접근 가능
    }

    A(int b) {             // default → 같은 패키지에서만 가능
    }

    private A(String s) {  // private → 클래스 내부에서만 가능
    }                                    
    
}
