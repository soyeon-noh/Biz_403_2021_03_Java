package com.callor.apps.model;

/*
 * 주소록 관리를 위한 프로젝트를 수행하기위해 
 * 주소록 데이터를 저장할 클래스를 설계하기
 * 
 * ex) 이름, 전화번호, 주소, email, 관계, 나이, 카카오톡
 * 인스타그램...
 * 
 * :: 추상화 단계 ::
 * (위의 데이터중에 몇을 추려내는 것)
 * 지금 내가 만들고자 하는 프로젝트에서 어떤 데이터가 반드시 필요한가,
 * 또는 없어도 되는 데이터는 무엇인가를 판단하여 간추려 내는 작업
 * 
 * ex) 이름, 휴대전화, 주소, email, 나와의 관계
 *  
 */

/* 
 * VO 클래스
 * Value Object : 데이터를 저장하는 용도의 객체
 * Dto : Data Transfer Object  // VO라고도하고 Dto라고 하기도한다... 조금 다르긴하다!
 * 								// 접미사에 VO, Dto가 있으면 객체를 담아두는 클래스다.
 * 
 */
public class AddressVO {

	/*
	 * 추상화 과정을 거쳐 간추려진 데이터를 저장할 변수 선언
	 * 
	 */
	
	public String name; // public 을 제외하면 다른 클래스에서 접근할 수 X
	public String cellPhone;
	public String email;
	public String chain;
	public String address;
	
}
