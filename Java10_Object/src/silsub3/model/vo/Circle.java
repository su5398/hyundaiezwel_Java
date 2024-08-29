package silsub3.model.vo;

public class Circle {
	public double PI = 3.14;
	private int radius;
	
	public Circle() {}
	
	public double getPI() {return PI;}
	public void setPI(double PI) {this.PI = PI;}
	
	public int getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
	
	public void incrementRadius() {
		System.out.println("원의 둘레: "+(2*radius*PI));
		System.out.println("원의 넓이: "+(radius*radius*PI));
		System.out.println("반지름 1 증가: "+(radius+1));
		System.out.println("증가된 원의 둘레: "+(2*radius*PI));
		System.out.println("증가된 원의 넓이: "+(radius*radius*PI));
	}
}
