package com.callor.var;
/* 
 * 클래스명은 첫글자 대문자
 * 변수명은 첫글자 소문자
 * 
 */

public class Varriable_16 {
	
	/*
	 * intDan, intNum 변수를 선언하고
	 * 3단 구구단을 출력하라.
	 */
	public static void main(String[] args) {
		
		int intDan = 3; // 3을 만들기 위한 변수
		int intNum = 1; // 2~9까지의 숫자를 만들기 위한 변수
		
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		// 단 * 숫자 = 결과
		
		//명령문 어디든 ++ 을 넣을 수 있다!
		
		System.out.println("================");
		
		intDan = 3;
		intNum = 2;
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum++);
		
		// ;(새미콜론)이 아니라 쉼표일 때도 각각은 하나의 명령이므로 
		// 다음 연산이 있을 경우 함부로 intNum에 ++ 을 하면
		// 연산결과에 영향이 있으므로 주의!! 
		
	}
}
