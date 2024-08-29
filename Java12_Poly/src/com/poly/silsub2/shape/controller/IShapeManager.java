package com.poly.silsub2.shape.controller;

import com.poly.silsub2.shape.model.vo.Circle;
import com.poly.silsub2.shape.model.vo.IShape;
import com.poly.silsub2.shape.model.vo.Rectangle;

public class IShapeManager {
	public void calcShape() {
        IShape s;

        // Circle 객체 생성 및 다형성 적용
        s = new Circle(15.5);
        System.out.println("원면적 : " + s.area());
        System.out.println("원둘레 : " + s.perimeter());

        // Rectangle 객체 생성 및 다형성 적용
        s = new Rectangle(34.5, 42.7);
        System.out.println("사각형면적 : " + s.area());
        System.out.println("사각형둘레 : " + s.perimeter());
    }
}
