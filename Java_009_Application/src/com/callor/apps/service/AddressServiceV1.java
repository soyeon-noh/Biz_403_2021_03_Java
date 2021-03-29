package com.callor.apps.service;

import com.callor.apps.model.AddressVO;

public class AddressServiceV1 {

	/*
	 * name, email, phone 3개의 매개변수를 통해
	 * 문자열을 전달받고 
	 * 전달받은 문자열을 Console에 출력하기
	 */
	public void printAddress(String name, String email, String phone) { //문자열 매개변수 3개
												// 객체지향 개념이 나오기전에 사용하는 방법. (= 모듈화 프로그램, 구조적 프로그램)
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
	}
	
	// AddressVO 클래스를 매개변수로 받는 method => 클래스가 매개변수야!
	public void printAddress(AddressVO adVO) { // 객체지향!!
		
		System.out.println(adVO.name);
		System.out.println(adVO.email);
		System.out.println(adVO.chain);
		System.out.println(adVO.address);
		System.out.println(adVO.cellPhone);
	}
	
}
