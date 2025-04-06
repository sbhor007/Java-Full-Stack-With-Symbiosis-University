package com.trg.componentAnnotations;

public class Food {
	private String foodName;
	private String quntity;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getQuntity() {
		return quntity;
	}

	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}

	public Food(String foodName, String quntity) {
		super();
		this.foodName = foodName;
		this.quntity = quntity;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", quntity=" + quntity + "]";
	}
	
	
}
