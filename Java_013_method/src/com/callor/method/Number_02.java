package com.callor.method;

public class Number_02 {

	public static void main(String[] args) {
		String strNum1 = "100";
		String strNum2 = "100.0";
		
		int intNum1 = Integer.parseInt(strNum1); // primitive 방식
		float floatNum2 = Float.parseFloat(strNum2);
		
		// NumberFormatException 이 발생하는 코드들
		// 숫자로 바꾸려고했는데 숫자형식이 아니네!
		intNum1 = Integer.valueOf("100");
		intNum1 = Integer.valueOf(" 100");
		intNum1 = Integer.valueOf("100 ");
		intNum1 = Integer.valueOf("A100 ");
		intNum1 = Integer.valueOf("100A");
		intNum1 = Integer.valueOf("100 00"); 
	}
}
