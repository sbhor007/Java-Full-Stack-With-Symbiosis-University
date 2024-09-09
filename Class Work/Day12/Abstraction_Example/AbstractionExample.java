package Abstraction;

abstract class GeometricShape{
	String nameOfShape;
	
	abstract double calculateArea();
	public abstract String toString();
	public  GeometricShape(String nameOfShape)
	{
		System.out.println("Inside the Constructor "
				+ "of GeometricsShape class" 
				);
		this.nameOfShape = nameOfShape;
	}
	public String getNameOfShape() {
		return nameOfShape;
	}	
}

class Circle extends GeometricShape
{
	double radius;

	public Circle(String nameOfShape,double radius) {
		super(nameOfShape);
		System.out.println("Inside the constructor of circle class");
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [\nName Of Shape=" + super.nameOfShape+ ", and its Area =" + calculateArea() + "]";
	}

		
}

class Square extends GeometricShape{
	double length;
	public Square(String nameOfShape,double length) {
		super(nameOfShape);
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}
	@Override
	public String toString() {
		return "\nSquare [Name Of Shape=" + super.nameOfShape 
				+ "And its Area=" + calculateArea()
				+ "]";
	}
		
}

public class AbstractionExample {

	public static void main(String[] args) {
		GeometricShape c = new Circle("Circle",5);
		System.out.println(c);
		
		GeometricShape s = new Square("Square", 15);
		System.out.println(s);
	}

}
