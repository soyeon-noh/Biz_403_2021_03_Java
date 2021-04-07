package com.callor.method.service;

public class ScoreServiceV3 {

	public void inputScore() {
		InputServiceV2 inService = new InputServiceV2();
		Integer intKor = 0;
		Integer intEng = 0;
		Integer intMath = 0;
		Integer intTotal = 0;
		Float floatAvg = 0.0f;
		
		
		intKor = inService.inputValue("국어",0,100);
		if(intKor == null) {
			System.out.println(">> 프로그램을 종료합니다");
			return;
		}
		intEng = inService.inputValue("영어",0,100);
		if(intEng == null) {
			System.out.println(">> 프로그램을 종료합니다");
			return;
		}
		intMath = inService.inputValue("수학",0,100);
		if(intMath == null) {
			System.out.println(">> 프로그램을 종료합니다");
			return;
		}
		
		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		
		floatAvg = (float)intTotal / 3;
		
		System.out.printf("총점 : %d\n",intTotal);
		System.out.printf("평균 : %5.2f",floatAvg);
	}
}
