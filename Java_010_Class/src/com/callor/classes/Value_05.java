package com.callor.classes;

import com.callor.classes.service.ValueService;

public class Value_05 {

	public static void main(String[] args) {
		
		ValueService vs = new ValueService();
		
		vs.nums();
		
		// retNum 멤버변수를 public으로 선언하면
		// 아래와 같이 간편하게 값을 읽을 수 있다.		
		// Integer result = vs.retNum;
		
		// vs.retNum = 200; 
		//     <= return 값이없는 void인 경우 이렇게 데이터가 오염될 수 있음
	
		// retNum 변수는 ValueService의 멤버변수이다.
		// 이 멤버변수의 값을 외부에서 변경하는 것은
		// 코드를 매우 위험스럽게 만드는 것이다.
		
		// 좋은 방법은 멤버변수를 private로 설정하고
		// getter() method를 통하여 읽기 전용으로 만드는 것이 좋다.
		
		Integer result1 = vs.getRetNum();
		
		Integer result2 = vs.numsRet(); // Integer이라 오염되지 않음
		
		// 메서드의 return문을 사용하는 이유.
		// 자신의 의도와 상관없이 데이터가 오염되는 것을 막기위함.
	}
}
