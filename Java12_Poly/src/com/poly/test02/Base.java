package com.poly.test02;

public abstract class Base {
	public Base() {
		System.out.println("Base 생성");
	}
	
	//추상메소드
	public abstract void start();
	public abstract void stop();
}
