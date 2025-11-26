package com.hyundai;

// import 패키지명.클래스명; -> 특정 클래스만 import
// import 패키지명.* -> 패키지의 모든 클래스를 import
import com.hankook.*;
import com.kumho.*;

public class Car {

	//이러면 오류 발생 한국의 Tire인지 금호의 Tire인지 식별 불가
	//Tire tire = new Tire();
	
	//클래스 전체 이름을 사용해서 정확히 어떤 패키지의 클래스를 사용하는지 알려줘야 한다
	com.hankook.Tire tire = new com.hankook.Tire();
	
	SnowTire st = new SnowTire();
	
}
