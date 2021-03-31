package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘날짜 : %s, 현재시각 : %s", curDate, curTime);
	}
}

// 날짜나 시간을 보는 것 정도는 괜찮은데
// 이것으로 계산을 하려고 할 때 문제가 생긴다!!!