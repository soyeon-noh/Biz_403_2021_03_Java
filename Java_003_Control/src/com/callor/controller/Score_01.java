package com.callor.controller;

public class Score_01 {
	
	public static void main(String[] args) {
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		int intAvg = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		intSum = intKor; // +=가 아니라 =만 넣는다
		intSum += intEng;
		intSum += intMath;
		
		intAvg = intSum / 3;
		
		System.out.println("========================");
		System.out.printf("국어: %d\n", intKor);
		System.out.printf("영어: %d\n", intEng);
		System.out.printf("수학: %d\n", intMath);
		System.out.println("------------------------");
		System.out.printf("총점: %d\t평균: %d\n"
				, intSum, intAvg); // \t는 tap
		System.out.println("========================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른 것처럼 줄바꿈 실행
		 * \t : Tab을 누른 것처럼 사이띄기를 일정하게 맞춤
		 */
		
	}
}
