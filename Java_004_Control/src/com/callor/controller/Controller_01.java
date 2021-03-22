package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
	
		int intsum3 = 0;
		int intsum4 = 0;
		int intsum5 = 0;

/*		for(int i = 0; i < 100; i++) { 	//이걸유지하고
			int num = i + 1;  			// 아래에 +1 추가해서 진행하래
			if(num % 3 == 0) {
			}
		}
*/		
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				intsum3 += i;
				if(i%5 == 0) {
					intsum5 += i;
				}
			}
			if(i%4 == 0) {
				intsum4 += i;
			}			
		}
	
		System.out.println("=========================");
		System.out.printf("3의 배수의 합 : %d\n", intsum3);
		System.out.printf("4의 배수의 합 : %d\n", intsum4);
		System.out.printf("3과 5의 배수의 합 : %d\n", intsum5);
		System.out.println("=========================");
	}
}
