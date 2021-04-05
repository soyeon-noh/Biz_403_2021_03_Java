package com.callor.method;

import java.util.Scanner;

public class Method_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 입력받을 것
		 * 		: 정수 0 ~ 100 또는 문자열 QUIT
		 * 다른 type의 데이터를 동시에 취급하기 위해서는
		 * 		기본 type를 String형으로 설정하는 것이 편하다
		 */
		System.out.println("0 ~ 100까지 중 정수입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">> ");
		
		// 모든 입력을 문자열 type로 하라
		// 입력받은 문자열을 strNum에 저장하라
		// int num = scan.nextInt(); // 문자열을 받아야할 때 오류
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다.");
		}else {
			
			// QUIT가 아닌 다른 값이 입력됐으면 
			// 일단 입력된 값을 정수형으로 변환해보자
			// 변환된 정수값을 변수에 저
			int intNum1 = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			// Integer.valueOf()로 변환된 값은 Integer값이래
			// 둘다가능. int로변환시켜서 int에 들어가는 것임
			
			System.out.println("입력된 정수:" + intNum2);
		}
	}

}
