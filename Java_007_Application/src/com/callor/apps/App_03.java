package com.callor.apps;

import com.callor.apps.service.PrimeServiceV1;

public class App_03 {

	public static void main(String[] args) {
		
		PrimeServiceV1 psV1 = new PrimeServiceV1(); // ★객체
		PrimeServiceV1 psVA = new PrimeServiceV1();
		PrimeServiceV1 psVB = new PrimeServiceV1();
		
		psV1.makeNums(); //객체에있는 메서드호출
		psVA.makeNums();
		psVB.makeNums(); //이름만 같지 셋다 다른 배열이다

		System.out.println("=======================");
		System.out.println("psV1");
		System.out.println("-----------------------");
		psV1.printPrime();
		
		System.out.println("=======================");
		System.out.println("psVA");
		System.out.println("-----------------------");
		psV1.printPrime();
		
		System.out.println("=======================");
		System.out.println("psV1");
		System.out.println("-----------------------");
		psV1.printPrime();
	}
}
