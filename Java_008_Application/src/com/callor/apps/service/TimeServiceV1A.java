package com.callor.apps.service;

public class TimeServiceV1A {

	// int[] nums; 주로 이렇게씀
	int nums[];
	
	public TimeServiceV1A() {
		nums = new int[8];
	}
	
	/* 
	 * 배열은 총 8개
	 * 배열에 저장할 값은 2 ~ 9
	 */
	public void makeTimes() {
		
		for(int i = 0; i < nums.length; i++) {
			int num = i + 2; // 2 ~ 9
			nums[i] = num; // 이렇게 num을만들고 그걸 배열에 넣어야하나? 이유는 뭔가? 
		} // => 그냥 내가하던대로  한줄로 해도된대
	}
	
	/*
	 * 배열에 담긴 값(2~ ??) = 단에 해당함
	 */
	public void printTimes() {
		
		// method에 return ?? 명령문이 있으면
		// 변수 = method() 형식으로 코드를 작성하고
		// method가 return 해준 결과값을
		// 변수에 저장할 수 있다.
		
		for(int i = 0; i < nums.length; i++) {
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			// 호출한 메서드의를 변수에 담아!
			System.out.println( dLines );
			System.out.printf("%d 단 구구단\n", nums[i]);
			System.out.println( sLines );
			
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",
						nums[i], j, nums[i] * j);
			}
		}
	}
	
}

