package com.callor.apps.service;

public class TimeServiceV2 {


	int nums[];
	
	public TimeServiceV2() {
		nums = new int[8];
	}
	
	public void makeTimes() {
		
		for(int i = 0; i < nums.length; i++) {
			int num = i + 2;
			nums[i] = num;  // num[i] = i + 2; 라고 해도 상관없대
		}
	}


	public void printTimes() {
		
		for(int i = 0; i < nums.length; i++) {
			//String dLines = LinesService.dLines(50);  호출해서 새로운 변수에 넣음
			//String sLines = LinesService.sLines(50);

			System.out.println( LinesService.dLines(50) );  // sysout(dLines) 그리고 그 변수를 출력 하는걸 <= 한줄로 적은 것
			System.out.printf("%d 단 구구단\n", nums[i]);
			System.out.println( LinesService.sLines(50) );
			
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",
						nums[i], j, nums[i] * j);
			}
		}
	}
	
}

