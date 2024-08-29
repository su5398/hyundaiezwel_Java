package com.poly.silsub1.shape.model.vo;

import com.poly.silsub2.shape.model.vo.IShape;

public class Triangle implements IShape{
	private double base;
	private double height;
	
	public Triangle() {}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (base*height)/2;
	}
	
	public double getHypotenuse() {
		return Math.sqrt(base*base*height);
	}
	
	@Override
	public double perimeter() {
		return base+height+getHypotenuse();
	}
	
}
