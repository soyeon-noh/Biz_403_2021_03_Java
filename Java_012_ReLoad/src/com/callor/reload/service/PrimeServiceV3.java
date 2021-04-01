package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1A {

	public void primeNum() {

		int rndNum = rnd.nextInt(51) + 50;
		// for() 반복문이 중단되었는가(break)
		// 아니면 모두 수행했는가

		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if(rndNum % index == 0) {
				break;
			}
		}
		// for() 가 끝난 순간
		//		break 되었을 때와 (항상 index < rndNum)
		//		그렇지 않은 경우를 확인하여
		//			(index == rndNum) (>=으로 표현..?)
		//		코드진행

		if(index < rndNum) {
			System.out.println(rndNum + " 는 소수가 아님");
		}else {
			System.out.println(rndNum + " 는 소수");
		}
	}
}
