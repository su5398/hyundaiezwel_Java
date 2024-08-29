package com.silsub2.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("원의 x, y좌표는 각각"+x+", "+y+"이다.");
		System.out.println("원면적: "+Math.round(radius*radius*Math.PI*10)/10);
		System.out.println("원둘레: "+Math.round(radius*2*Math.PI*10)/10);
	}
}
