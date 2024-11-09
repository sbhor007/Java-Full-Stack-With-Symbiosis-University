package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "rectangle")
public class Rectangle extends Shape {
	@Column(name = "length")
	private double length;
	@Column(name = "breadth")
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle() {}
	
	public Rectangle(String shapeName,double length, double breadth) {
		super(shapeName);
		this.length = length;
		this.breadth = breadth;
	}
	
	
}
