package com.callor.reload.service;

public class PrimeServiceV5 extends PrimeServiceV4A{

	@Override
	public void primeNum() {
		
		for(int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			int index = 0;
			for(index = 2; index < rndNum; index++) {
				if(rndNum % index == 0 ) {
					break;
				}
			}
			// index < rndNum 와 반대인 경우
			//				index >= rndNum : 권장
			// 				index == rndNum : 위험함
			if(index >= rndNum) {
				primeList.add(rndNum);
			}
		}
	}
}