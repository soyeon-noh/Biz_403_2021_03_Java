package com.callor.method.service;

public class NumberServiceV1 {

	public Integer addNum(int num1, int num2) {
		Integer sumNum = num1 + num2;
		
		if(sumNum % 2 ==0) return sumNum;
		else return null;
	}
}
