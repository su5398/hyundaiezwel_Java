package com.inherit.par01_inheritTest.after;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Television t = new Television("LG","09","T-321","LG TV",500000,new Date(),65);
		System.out.println(t.printInfo());
		System.out.println(t.getBrand());
		
		Desktop d = 
				new Desktop("애플","02","D-123","Mac",400000,new Date(),"cpu",500,64,"mac os",false);
		
		SmartPhone s = new SmartPhone("삼성","01","s-333","폴드",20000,new Date(),"cpu2",1024,16,"android","KT");
		
		System.out.println(d.printInfo());
		System.out.println(s.printInfo());
	}
}
