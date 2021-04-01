package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1A{

	// protected로 선언된 객체, 변수는
	// 자동으로 생성되어
	// 상속 받은 곳에서 사용할 수 있다.
	// Random rnd; 을 안 만들어도 됨
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		// ★ flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false; // 깃발없었는데
		for(int i = 2; i < rndNum; i++) {
			if(rndNum % i == 0) {
				notPrime = true; // 깃발 꽂힘
				break; // 생략해도 코드 실행에는 문제없다
			}
		}
		// flag 상태에 따라 소수, 소수가 아님을 출력
		if( notPrime ) { // == true 생략가능
			System.out.println(rndNum + " 는 소수가 아님");
		}else {
			System.out.println(rndNum + " 는 소수임");
		}
		
	}
}
