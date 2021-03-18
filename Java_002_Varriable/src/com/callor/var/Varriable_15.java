package com.callor.var;

public class Varriable_15 {

	public static void main(String[] args) {
		int intSum = 0;
		int intNum = 0; // 0, 2, 4, 6, 8, 10 이 되어야 함.
		
		/*
		 	for( ; intNum< 11 ; ) {
			intNum++;
			intSum = (intNum % 2 == 0) ? intSum += intNum : intSum;
			}
		*/
		
		//intNum = 0
		intSum += (intNum += 2); //intNum = 2
		intSum += (intNum += 2); //intNum = 4
		intSum += (intNum += 2); //intNum = 6
		intSum += (intNum += 2); //intNum = 8
		intSum += (intNum += 2); //intNum = 10
		
		System.out.println("0부터 10까지 짝수의 합: " + intSum);
	}
}
