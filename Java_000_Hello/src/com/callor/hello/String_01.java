package com.callor.hello;

public class String_01 {

	public static void main(String[] args) {
		// ""로 감싸진 데이터의 모든 것
		// 문자열
		// String형 값(데이터, 자료)
		// String형 리터럴 
		System.out.println("대한민국");
		System.out.println("우리나라");
		System.out.println("30 + 40");
		System.out.println("30 + 40 = 70");
		
		// 문자열과 문자열의 plus 연산
		// 문자열을 서로 연결하는 연산 결과
		// 문자열 연결 연산 이라고 한다.
		System.out.println("대한" + "민국"); // 덧셈연산이 아니라 연결연산임
		
		// 문자열과 숫자의 연결 연산
		System.out.println("3 + 4 = " + 3 + 4);
		System.out.println("3 + 4 = " + (3 + 4)); //우선순위 사용
		System.out.println("3 x 4 = " + 3 * 4);

		/*
		 *  문자열은 문자열기리 plus(연결)연산이 가능
		 *  => 문자열을 연결하여 하나의 문자열로 만든다.
		 *  
		 *  "문자열" + "문자열" => 문자열문자열
		 *  "문자열" + 3 => "문자열" + "3" => 문자열3
		 *  
		 *  "문자열" + 3 + 4
		 *  => "문자열" + "3" + 4
		 *  => "문자열3" + 4
		 *  => "문자열3" + "4"
		 *  => "문자열34"
		 *  
		 *  "문자열" + ( 3 + 4 )
		 *  => "문자열" + 7
		 *  => "문자열" + "7"
		 *  => "문자열7"
		 *  
		 *  "문자열" + 3 * 4
		 *  => "문자열" + 12
		 *  => "문자열 + "12"
		 *  => "문자열12"
		 *  
		 */
		
		// System.out.println("3 - 4 = " + 3 - 4);
		// - 는 string이랑 연결할 수 없다고 오류남
		
		System.out.println("3 - 4 = " + (3 - 4));
		
		
		
	}
}
