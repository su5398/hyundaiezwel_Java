package com.poly.test02;

public class Dog extends Base{

	@Override
	public void start() {
		System.out.println("개 걷는다.");
	}
	
	@Override
	public void stop() {
		System.out.println("개 멈췄다.");
	}
}
