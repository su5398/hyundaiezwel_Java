package com.poly.test01;

public abstract class Animal {
	String a;
	
	//추상메소드 -> 상속받는 class가 구현.
	public abstract void bark();
	
	public void eat(String ani) {
		System.out.println(ani+"먹는다.");
	}
}
