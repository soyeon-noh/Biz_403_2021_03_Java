package com.callor.classes.service;

public class Lines {

	public static String dLine(int nCount) {		

		// printf() 는 화면에 출력하는 form을 만드는
		// 출력 method
		// String.format() 은 화면에 출력하는 대신
		// 문자열로 만들어 return하는 method
		// 만들어진 문자열을 dLine 변수에 담는다
		String dLine = String.format("%0" + nCount + "d", 0).replace("0", "="); // nCount개의 칸을 만들고 거기에 0 하나를 채워라
			
		// nCount 값이 50이라면
		// %050d 형식의 format 문자열이 생성될 것이다.
		
		return dLine;
	}
	
	public static String sLine(int nCount) { //위의 dLine을 정리하면 이렇게됨
		
		return String.format("%0" + nCount + "d", 0).replace("0","-");
	}
}
