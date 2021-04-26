package com.callor.fine;

public class MainEx_07 {

	/*
	 * ===================================
	 * 5단 구구단
	 * -----------------------------------
	 * 5 x 1 = 5
	 * 5 x 2 = 5
	 * 5 x 3 = 5
	 * 5 x 4 = 5
	 * 5 x 5 = 5
	 * 5 x 6 = 5
	 * 5 x 7 = 5
	 * 5 x 8 = 5
	 * 5 x 9 = 5
	 * ===================================
	 * 
	 * 구구단 출력하기
	 */
	
	public static void main(String[] args) {
		System.out.println("=".repeat(50));
		System.out.println("5단 구구단");
		for(int i = 0; i < 9; i++) {
			int num = i + 1;
			System.out.printf("5 x %d = %2d\n", num, num * 5);
		}
		System.out.println("=".repeat(50));
	}
}
