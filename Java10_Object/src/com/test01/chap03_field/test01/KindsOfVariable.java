package com.test01.chap03_field.test01;

//변수 선언 위치에 따른 구분
public class KindsOfVariable {//클래스 영여의 시작
	
	//클래스 영역에 작성하는 변수
	//필드==맴버변수==전역 수
	private int globalNum;
	
	public void testMethod(int num) {//메소드영역시작
		
		//메소드 영역에 작성하는 변수 지역변수
		//메소드의 괄호 안에 선언하는 변수 매개변수
		int localNum;
		
		System.out.println(num);
		
		//지역변수는 선언 외에 사용하기 위해서는 반드시 초기화가 되어야 한다.
		//System.out.println(localNum);
		
		System.out.println(globalNum);//전역변수는 클래스 전역에서 사용가능
	}//메소드 영역 끝
	
	public void testMethod() {
		System.out.println(globalNum);//전역변수는 다른 메소드(클래스 전역)에서 사용가능
		//System.out.println(localNum); 지역변수는 해당지역(선언한지역, 블럭 내)에서만 사용가능
		
	}
	
}//클래스 영역의 끝
