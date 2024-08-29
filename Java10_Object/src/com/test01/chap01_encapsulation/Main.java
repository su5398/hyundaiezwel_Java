package com.test01.chap01_encapsulation;

public class Main {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.in(500000);
		acc.out(30000);
		acc.display();
	}
}
