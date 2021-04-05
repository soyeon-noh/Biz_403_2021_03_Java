package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class Method_01 {

	/*
	 * Random수(난수)를 1개 생성하여 3의 배수인지 판별
	 */
	public static void main(String[] args) {
		/*
		 * Random 클래스를 사용하여 rnd 객체를 선언하고
		 * 		Random() 생성자 method를 호출하여
		 * 		객체를 생성(초기화)하는 코드
		 * 객체를 선언만 하고 생성(초기화)하지 않은 상태로
		 * 		객체.method()를 호출하면
		 * 		NullPointerException이 발생한다.
		 * 
		 * NullPointerException
		 * 		객체가 아직 실체가 없다.
		 */
		
		// Random rnd = null;  이것만 돌리면 오류뜸
		// rnd = new Random(); 이 두줄을 하나로 합친것
		Random rnd = new Random();
		Integer intNum = rnd.nextInt(100) + 1;
		
		/*
		 * Scanner 클래스를 사용하여 scan 객체를 선언하고
		 * 		Scanner() 생성자 method를 호출하여
		 * 		scan 객체를 생성한다.
		 * Scanner() 생성자는 객체를 생성할때
		 *		System.in(키보드 입력 장치)를 연결할 수 있도록
		 *		매개변수에 정보를 전달해주어야 한다. 
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		 * String 클래스를 사용하여 str1 객체를 생성한다
		 * String 클래스는 클래스이면서 변수적인 성질을 갖는
		 * 		특별한 클래스이다.
		 * 		사용법이 클래스 방식이면서,
		 * 		일반적인 변수처럼 사용할 수 있다.
		 * Wrapper 클래스들도 그러한 성질을 갖는다.
		 */
		String str1 = new String(); // 매개변수가없는 생성자
									// 저장되는 값 ""
		String str2 = new String("대한민국");	// 매개변수가 있는 생성자
												// 저장되는 값 "대한민국"
		String str3 = "우리나라";	// 이렇게도 가능하다
		// 매개변수가 있어도, 없어도 가능하다!
		
		/*
		 * int형 변수와
		 * Integer wrapper를 사용하여 만든 변수
		 * 사용하는 기본방법은 동일하다
		 * Integer는 클래스적인 특성을 갖고 있다보니
		 * new Ingeger() 생성자를 사용하여 변수를 만들면
		 * 다소 엉뚱하게 작동되는 경우가 있다.
		 * 그래서 지금은 Integer() 생성자를 사용하여
		 * 변수를 만들지 못하도록 하고 있다.
		 * 
		 * 숫자형 변수는
		 * 		생성자를 사용하여 변수를 만들지 말자!!!
		 */
		// Integer int1 = new Integer(); // 사용금지!!
		Integer int1 = 30;
		
		/*
		 * int1에 저장된 정수가 3의 배수인가?
		 */
		int1 = rnd.nextInt(100) + 1;
		/*
		 * if 조건문을 사용하여 어떤 조건을 검사했을 때
		 * 조건에 완전히 일치하는 경우에는
		 * 		'~~ 하다, ~~다' 라고 표현하고,
		 * 조건에 일치하지 않는 else를 사용하여 표현할 때는
		 * 		딱 맞아 떨어지는 어떤 조건을 찾기가 어렵기 때문에
		 * 		'~~ 가 아니다' 라고 표현하는 것이 좋다.
		 */
		if(int1 % 3 == 0 ) {
			System.out.println(int1 + "은 3의 배수");
		}else {
			System.out.println(int1 + "은 3의 배수가 아니다");
		}
		/*
		 * 어떤 수가 짝수인지 조건검사하고
		 * 짝수이면 '짝수이다'라고 표현하고
		 * else 이면 '홀수이다'라고 표현할 수 있지만
		 * 코드를 작성할 때 조건으로 명시한 이외의 경우는
		 * 가급적 '~~ 가 아니다' 라고 표현하자
		 */
		if(int1 % 2 == 0) {
			System.out.println(int1 + "은 짝수이다");
		}else {
			// System.out.println(int1 + "은 홀수이다");
			System.out.println(int1 + "은 짝수가 아니다");
		}
	}
}
