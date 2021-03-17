package com.callor.values;

public class Values_04 {
	public static void main(String[] args) {
		
		// %f : 실수를 출력할 때
		// 소수점이하 자릿수를 지정할 수 있다.
		// %3.2f : 소수점이하 3째에서 반올림하고
		//			둘째자리까지 표시하라
		System.out.printf("%3.1f\n", 33.25678);
		System.out.printf("%3.2f\n", 33.25678);
		System.out.printf("%3.3f\n", 33.25678);
		System.out.printf("%3.4f\n", 33.25678);
		System.out.printf("%3.5f\n", 33.25678);
		
		System.out.printf("%d + %d = %3d\n", 33, 2, 33+2);
		System.out.printf("%d x %d = %3d\n", 33, 2, 33*2);
		System.out.printf("%d - %d = %3d\n", 33, 2, 33-2);
		System.out.printf("%d / %d = %3d\n", 33, 2, 33/2);
		//System.out.printf("%d % %d = %3d\n", 33, 2, 33%2); 오류발생
		System.out.printf("%d MOD %d = $3%d\n", 33, 2, 33%3);
		System.out.printf("%d / %d = %3.1f\n", 33, 2, 33/2.0);
	}
}
