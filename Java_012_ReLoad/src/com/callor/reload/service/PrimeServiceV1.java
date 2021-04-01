package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd; // 아니 또 접근제한자 까먹었다.
	
	public PrimeServiceV1() {
		rnd = new Random();
	}
	
	public void primeNum() {
		int num = 0;
		num = rnd.nextInt(51) + 50;
		
		int nCount = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				nCount++;
			}
		}
		
		if(nCount > 0) {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}else {
			System.out.println(num + "은(는) 소수입니다.");
		}
		
	}
	
}
