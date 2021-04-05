package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	
	Random rnd;
	public NumberServiceV1() {
		rnd = new Random();
	}
	
	public Integer inputNum() {
		Integer intNum = 0;
		intNum = rnd.nextInt(100)+1;
		if(intNum % 3 == 0) return intNum; 
		else return null;
	}
}
