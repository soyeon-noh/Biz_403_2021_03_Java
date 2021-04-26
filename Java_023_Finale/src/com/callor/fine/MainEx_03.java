package com.callor.fine;

public class MainEx_03 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		// 출력결과는 30
		
		// 빨간줄 두줄을 해결하기 위해서 AddInt() 클래스가 필요하다
		// 클래스를 만드니까 add메소드가없다
		// 어떤 메소드를 만들어야 30이나올까? 하는 문제
	}
}
