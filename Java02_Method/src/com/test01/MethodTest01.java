package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		//static method 실행
		//클래스명.메소드();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();
		privateMethod();
	}
 
	//접근 제한자 : 어디서나 접근, 참조 가능(+)
	public static void publicMethod() {
		System.out.println("public method");
	}
 
	//상속일 경우 상속된 곳에서 접근, 참조 가능(#)
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//같은 패기키 내에서 (default)
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	//현재 클래스 내에서만
	private static void privateMethod() {
		System.out.println("private method");
	}
}
