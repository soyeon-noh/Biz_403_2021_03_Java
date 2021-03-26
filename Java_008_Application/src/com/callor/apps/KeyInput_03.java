package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		
		String dLines = LinesService.dLines(45); // 변수타입 변수명 = 클래스명.메서드명
		String sLines = LinesService.sLines(45);  // Lines는 LinesService 인스턴스를 안만드나?
						// 만들 필요가 없나? 바로 그냥 ..
						// 아! 메소드에 return값이 있으면 그냥 바로 변수에 담을 수 있대!
		
		
		Scanner scan = new Scanner(System.in); // 클래스명 인스턴스명 = 새로운 인스턴스생성 
		
		System.out.println(dLines);
		System.out.println("::사칙연산 계산기::");
		System.out.println("첫번째 정수를 입력하고 Enter를 눌러주세요.");
		System.out.print("정수1: ");
		int num1 = scan.nextInt(); //변수타입 변수명 = 인스턴스명.메서드명
		System.out.println("두번째 정수를 입력하고 Enter를 눌러주세요.");
		System.out.print("정수2: ");
		int num2 = scan.nextInt();
		System.out.println(sLines);
		System.out.println("::계산결과::");
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.println(dLines);
	}
	
	
	
}
