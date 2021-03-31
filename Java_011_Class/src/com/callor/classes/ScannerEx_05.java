package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		
		if(str.equals("END")) {
			System.out.println("안녕!!!");
		} else {
			System.out.println("반가워!!!");
		}
		// 문자열은 ==이 안먹힐 때가 있다.
		// 문자열 변수의 특성
		// 문자열은 == (동등연산자) 쓰면 안된다.
		// 		ex) str1 == str2
		//		ex) str == "END"
		// 대신 str.equals("END") 같은 메서드를 사용해라.
	}
}
