package com.callor.app;

public class App_08 {

	/*
	 * 어떤 정수의 단위 자릿수가 얼마인가를 계산하는 코드
	 */
	public static void main(String[] args) {

		int intNum = 158729185;
		int nCount = 0;
		String str = "";
		while (intNum > 0) {
			nCount++;
			str += (intNum / 10);
			if(nCount % 3 == 0) {
				str += ",";
			}
			intNum /= 10;
		}
		System.out.println(str);
	}
}
