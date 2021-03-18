package com.callor.var;

public class Varriable_20 {

	public static void main(String[] args) {
		
		int intKor = 91;
		int intEng = 82;
		
		int intSum = intKor + intEng;
		
		System.out.println(intKor + intEng);
		
		// 이렇게하면 intSum이 쓸모없어짐
		System.out.printf("%d + %d = %d", 
				intKor, intEng, intKor + intEng);
		// 이렇게 해야 변수가 다 잘 사용된다.
		System.out.printf("%d + %d = %d", 
				intKor, intEng, intSum);
		
		System.out.println();
		// Sum변수가 있어서 
		// 22줄처럼 연산할 필요 없이 23줄처럼 바로 사용가능
		int avg = (intKor + intEng) / 2;
		avg = intSum / 2;
		System.out.println("평균: " + avg);
		
		// 최소 2번은 쓸 값은 변수에 넣어라!
	}
}
