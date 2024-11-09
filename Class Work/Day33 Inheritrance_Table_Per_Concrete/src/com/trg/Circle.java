package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "circle")
public class Circle extends Shape {
	@Column(name = "radius")
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {}
	public Circle(String shapeName,double radius) {
		super(shapeName);
		this.radius = radius;
	}
	
}
