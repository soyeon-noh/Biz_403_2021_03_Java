package com.callor.apps.service;

public class TimeServiceV1 {
	
	int[] intNum;
	
	public TimeServiceV1() {
		intNum = new int[8];
	}

	public void makeNum() {
		for(int i = 0; i < intNum.length; i++) { //length좀 이용하기
			intNum[i] = i + 2;
		}
	}
	
	public void printMulti() {
		for(int i = 0; i < intNum.length; i++) {
			System.out.println("=============");
			System.out.printf("%5d 단\n", intNum[i]);
			System.out.println("-------------");
			for(int j = 0; j < 8; j++) {
				System.out.printf("%2d x%2d = %2d\n"
						, intNum[i], (j+2), intNum[i] * (j+2));
			}
		}
	}
}
