package com.poly.silsub3.shape.controller;

import com.poly.silsub1.shape.model.vo.Triangle;
import com.poly.silsub2.shape.model.vo.Circle;
import com.poly.silsub2.shape.model.vo.IShape;
import com.poly.silsub2.shape.model.vo.Rectangle;

public class ShapeManager {
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(7.5);
        iarr[1] = new Rectangle(20.0, 15.0);
        iarr[2] = new Triangle(10.0, 12.0);
        iarr[3] = new Circle(5.0);
        iarr[4] = new Rectangle(10.0, 8.0);
        
        for (IShape shape : iarr) {
            System.out.println("면적: " + shape.area());
            System.out.println("둘레: " + shape.perimeter());

            if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("빗변 길이: " + triangle.getHypotenuse());
            }
            System.out.println();
        }
	}
}
