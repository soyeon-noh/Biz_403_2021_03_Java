package com.callor.apps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.callor.apps.model.ScoreVO;
import com.callor.apps.service.ScoreServiceV2;
import com.callor.apps.service.ScoreServiceV5;

/*
 * 객체 == 변수
 * 객체와 변수는 선언, 생성, 사용방법이 매우 유사하다. (개념이 같다는 것이 아님!)
 * 객체 만들어진다 == 기억장치 어딘가에 저장소가 만들어진다
 * 						마치 변수처럼!!
 * 객체 연결 연산자(점 연산자)가 있다.
 * 객체 자체만으로는 어떤 역할을 수행하지 않는다
 * 	다만, method에 매개변수로 전달할 때는 거의 변수와 
 * 	같이 사용된다.
 */
public class ScoreEx_04 {

	public static void main(String[] args) {
		
		// 객체 이름짓기
		// 클래스 이름의 첫글자를 소문자로 하여 그대로 사용 
		ScoreVO scoreVO = new ScoreVO();
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5(6);
		
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2(); // 옛날부터 이런 패턴으로 이름을 지었는데
		ScoreServiceV2 ssV2 = new ScoreServiceV2(); // 요즘은 이렇게 해도 괜찮나?
				
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		Random rnd = new Random();
		
		
		/*
		 * 기본 변수 선언 키워드(primitive varriable key word)
		 * int, long, double, float, boolean, char
		 * 
		 * 기본 변수와 사용법이 같은 클래스
		 * wrapper class
		 * 		: 기본 변수를 감싸고 기능을 확장한다 라는 뜻
		 * Integer, Long, Double, Float, Boolean, Character
		 * 
		 * 
		 */
		
		int num = 30; // num. 해도 별거 안뜨는데   // c언어에서 파생된 자료형인데
		Integer num1 = 30; // num1. 하면 메서드가 주르륵 뜸 // java에서 부족한 것들을 확장시켜 놓은게 Integer같은 것.
		
		num1.floatValue(); // 변수이면서 객체
		// Integer라는 클래스에 있는 메서드로, float로 리턴된다는 뜻.
		
		float f1 = num1.floatValue();
		Float numF = (float)num;
		
		long longF = 0L;
		Long longF1 = 0L;
		
		double douN = 0;
		Double douN1 = 0.0;
		
		boolean bYes = true;
		Boolean bYesB = true;
		
		char char1 = 'A';
		Character char2 = 'B';
		
		String str1 = "대한민국"; // 스트링은 기본형이 없음. 
		
		Integer numInt = 30;
		String str2 = numInt.toString(); // 숫자를 문자열로 바꾸는. 이런 확장코드들이 있는 것임.
		str2 = numInt + ""; // 이것도 숫자를 문자열로 변환시키는 코드임. 이게 있는데 왜 위의 것이 필요하냐?
							// 그런데 이건 Java 스럽지않다!(클래스와 객체를 우선시해야함) 해서 위의 코드들을 만든 것이다.
		str2 = "10";
		str1 = "9";
		
		System.out.println(str1 + str2); // 910
		
		Integer n1 = Integer.valueOf(str1); //문자열형 숫자를 사칙연산이 가능한 Integer형으로 변환한다.
		Integer n2 = Integer.valueOf(str2); // 클래스.기울어진 메서드 < 이거 static이라는데 어떻게 아는거지?
		System.out.println(n1 + n2); // 19
		
		Float fn1 = Float.valueOf(str1);
		Float fn2 = Float.valueOf(str2);
		System.out.println(fn1 + fn2);
		
		fn1 = Float.valueOf(n1);
		n1 = Integer.valueOf(str2);
		
		str1 = "대한민국";
		System.out.println(str1.length());
		
		// ""로 묶인 문자열은 그 자체로 문자여형 객체가된다.
		System.out.println("우리나라만세".length()); // 그래서 .length() 같은 메서드가 적용되는 것임!
		String strNation = new String("우리나라만세");
		
		System.out.println(strNation.length());
		
		// method를 호출하여 return한 결과를
		// 또다른 method에 매개변수로 전달하는 코드의 예
		System.out.println(
				Arrays.toString(
						"Republic of Korea".split(" ") // split의 리턴값을 다른 메서드의 매겨변수로 ... toString의 리턴값을 println으로 넣어준다.
				)	// 메서드에 메서드가 계속 겹치는 상태
		);
		System.out.println(
				Integer.valueOf("30") + Integer.valueOf("40")
		);
		
		// 메서드가 리턴해주는 것을 그대로 메서드에 넣는것보다
		// 변수에 넣는 것이 바람직하긴 하다! 
		// 그저 하나의 예를 보여주는 것.
		
	}
}




















