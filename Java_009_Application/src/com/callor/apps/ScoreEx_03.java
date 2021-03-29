package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_03 {

	public static void main(String[] args) {
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 99;
		
		int total = 홍길동.getTotal(); // 1. 변수에 담아서
		System.out.println("홍길동 총점 : " + total); // 출력해도되고
		
		// :: 정보의 은닉 ::
		// 멤버변수를 private으로 선언하는 것
		// 멤버변수의 값이 원치않게 변경되는 것을 방지하기 위함.
		// (ScoreVO참고)
		
		// private 선언된 total 멤버변수는
		// 연결연산자를 통해 total 멤버변수에
		// 값을 직접 저장할 수 없다.
		
		// ex) 홍길동.total = 900;
		
		// ★ :: getter method ::
		// get으로 시작되는 method는 
		// private으로 선언된 멤버변수의 값을
		// 읽을때 사용하는 method선언 접두사이다.
		
		System.out.println("홍길동 평균 : " + 홍길동.getAvg()); // 2. 그대로 출력해도됨. return문에 작성했으니까.
		
		System.out.println(홍길동.getClass()); // 홍길동 객체을 만드는데 썼던 클래스가 어떤건지 어딨는지 알려줌.
	
	}
}

// 객체지향
// 상속 : 확장, 메서드의 재정의
// 추상화, 정보의 은닉
// 캡슐화 : 어떻게 작동하는지는 모르겠지만 기능을 사용할 수 있게되는 것.



















