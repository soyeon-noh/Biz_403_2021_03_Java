package com.callor.method.service;

public class NumberServiceV7 {

	protected InputService inService;
	
	public NumberServiceV7() {
		inService = new InputService();
	}

	public Integer checkScore() {
		
		return null;
	}
	
	public Integer inputScore() {
		String[] subject = { "국어", "영어", "수학", "과학", "국사" };
		Integer retNum = null;

		for (int i = 0; i < 5; i++) {
			while (true) {
				retNum = inService.inputValue(subject[i]);
				if (retNum == null) {
					return null;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("0 ~ 100 사이의 값을 입력하세요");
					continue;
				} else {
					System.out.println(subject[i] + "의 점수 : " + retNum);
					break;
				}
			}
		}
		return retNum;

	}
}
