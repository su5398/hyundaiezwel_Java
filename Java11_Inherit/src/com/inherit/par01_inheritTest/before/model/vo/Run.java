package com.inherit.par01_inheritTest.before.model.vo;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성","01","s-0123","갤럭시북","i9",500,32,"window11",
				2000000,new Date(),true);
		
		SmartPhone s = new SmartPhone();
		
		Television t = new Television("LG","03","T-321","LG TV",5000000,new Date(), 65);
		
		d.printInfo();
		s.printInfo();
		t.printInfo();
	}

}
