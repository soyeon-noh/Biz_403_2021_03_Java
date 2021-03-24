package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] intNum = new int[20];
		
		for(int i = 0; i < 20; i++) {
			intNum[i] = random.nextInt(100) + 1;
			
			if(intNum[i] % 2 == 0) {
				System.out.printf("짝수가 저장된 최초의 배열 위치는 %d 번째의 %d이다."
						, i, intNum[i]);
				break;
			}
		}
		
		
	}
}
