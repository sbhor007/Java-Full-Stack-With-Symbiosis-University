package com.trg.componentAnnotations;

public class Juice {
	private String juiceName;
	private Food food;

	public String getJuiceName() {
		return juiceName;
	}

	public void setJuiceName(String juiceName) {
		this.juiceName = juiceName;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	public Juice() {
		// TODO Auto-generated constructor stub
	}
	public Juice(String juiceName, Food food) {
		super();
		this.juiceName = juiceName;
		this.food = food;
	}

	@Override
	public String toString() {
		return "Juice [juiceName=" + juiceName + ", food=" + food + "]";
	}
	
	
	
}
