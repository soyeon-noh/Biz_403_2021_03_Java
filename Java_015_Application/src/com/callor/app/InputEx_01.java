package com.callor.app;

import com.soyeon.standard.InputService;
import com.soyeon.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] args) {
		// 선언은 인터페이스, 생성자는 구체적 클래스!! 
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
	}
}
