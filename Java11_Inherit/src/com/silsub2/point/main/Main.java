package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Point;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,2);
		
		Circle[] cArr = new Circle[3];
		cArr[0] = new Circle(1,2,3);
		cArr[1] = new Circle(4,5,6);
		cArr[2] = new Circle(7,8,9);
		
		Rectangle[] rArr = new Rectangle[3];
		rArr[0] = new Rectangle(1,2,3,4);
		rArr[1] = new Rectangle(5,6,7,8);
		rArr[2] = new Rectangle(9,10,11,12);
		
		for(int i=0; i<3; i++) {
			cArr[i].draw();
			rArr[i].draw();
		}
	}

}
