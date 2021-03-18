package com.callor.var;

public class Varriable_05 {
	
	public static void main(String[] args) {
	
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; // intSum = 1
		
		intNum ++; // intNum = 2
		intSum += intNum; // intSum = 1 + 2
		
		intNum ++; // intNum =3
		intSum += intNum; // intSum = 3 + 3
		
		intNum ++; // intNum =4
		intSum += intNum; // intSum = 6 + 4
		
		intNum ++; // intNum =5
		intSum += intNum; // intSum = 10 + 5
		
		System.out.println(intSum);
		
		
	}
}
