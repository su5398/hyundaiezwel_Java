package com.poly.test04;

public class Pigeon extends Animal implements Bird {
	
	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}
	
	@Override
	public void bark() {
		System.out.println("99999");
	}
}
