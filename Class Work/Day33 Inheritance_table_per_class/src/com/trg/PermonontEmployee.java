package com.trg;

import javax.persistence.*;

@Entity
@DiscriminatorValue("perEmp")
public class PermonontEmployee extends Employee {
	@Column(name = "salary")
	private double salary;
	@Column(name = "bonus")
	private int bonus;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
