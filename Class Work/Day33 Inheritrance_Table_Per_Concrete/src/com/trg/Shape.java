package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "shape")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shape {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "shapeId")
	private int shapeId;
	@Column(name = "shapeName")
	private String shapeName;
	public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public Shape() {
		
	}
public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	
	
}
