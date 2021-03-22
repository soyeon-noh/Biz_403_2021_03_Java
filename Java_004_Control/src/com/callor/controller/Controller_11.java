package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	// 1 ~ 100까지 범위의 난수 5개를 만들고
	// 그 수가 3의 배수인지 아닌지를 판별하여 출력하라.
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i=0; i<5; i++) {
			int numInt = rnd.nextInt(100) + 1; // rnd.nextInt(100) 만 하면 범위 0~99
			if(numInt % 3 == 0) {
				System.out.println(numInt + "은(는) 3의 배수입니다.");
			} else
				System.out.println(numInt + "은(는) 3의 배수가 아닙니다.");
		}
	}
}