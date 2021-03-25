package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] intNum = new int[20];
		
		for(int i = 0; i < 20; i++) {
			intNum[i] = random.nextInt(51) + 50;
		}
		
		System.out.println("=====소수인 수=====");
		
		boolean notPrime = false;
		for(int i = 0; i < 20; i++) {
			for(int j = 2; j < intNum[i]; j++) {
				if(intNum[i] % j == 0) { 
					notPrime = true;
					break;
				}
			}

			if(notPrime == false) {
				System.out.printf("%d ",intNum[i]);
			}
		}
	
		System.out.println("\n===================");
	
		for(int i = 0; i < 20; i++) {
			for(int j = 2; j < intNum[i]; j++) {
				if(intNum[i] % j == 0) { 
					break;
				}else {
					if(intNum[i] == j + 1) {
						System.out.printf("%d ",intNum[i]);
					}
				}
			}
		}
		
		System.out.println("\n===================");
	}
	
	
}
