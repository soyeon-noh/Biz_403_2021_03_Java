package com.callor.method;

import com.callor.method.service.NumberServiceV2;

public class Test {

	public static void main(String[] args) {
		NumberServiceV2 nsV2 = new NumberServiceV2();
		
		System.out.println(nsV2.inputNum());
	}
}
