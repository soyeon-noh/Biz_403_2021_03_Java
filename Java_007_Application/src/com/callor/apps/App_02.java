package com.callor.apps;

import java.util.Random;

import com.callor.apps.service.PrimeServiceV1;

public class App_02 {
	public App_02() {  // 이거 ctrl + space 누르니까 그냥 나옴. 있는데 안보였던 것. 필요할때만 만들어라
		// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		
		// PrimeServiceV1 클래스를 사용하여
		// psV1 객체를 선언하고
		// 					생성하여 (생성자 메서드를 호출해서!!)
		//					인스턴스변수로 만들었다
		// new PrimeServiceV1()
		//		PrimeServiceV1클래스에 있는
		//		생성자 method를 호출(실행)하여
		//		psV1 객체를 사용할 수 있도록
		// 		생성, 초기화, 준비 해달라.
		PrimeServiceV1 psV1 = new PrimeServiceV1();	
		psV1.makeNums();
		psV1.printPrime();
		
		PrimeServiceV1 psV11 = new PrimeServiceV1();
		psV1.makeNums();
		psV1.printPrime();
		
		int num1 = 30;
		int num2 = 40;
		
		
	}
		// // Random 클래스를 이용해서 rnd라는 객체를 선언하고
		// // Random생성자 메소드를 호출해서 
		// // rnd 객체를 인스턴스객체로 만들어 사용할 수 있게 해라
			// // 생성자 메소드를 호출할땐 new가 필요함 = > 왜? void가 없어서
		// Random rnd = new Random(); 
}
