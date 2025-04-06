package com.trg.componentAnnotations;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Config {
	public Food myFood() {
		Food f = new Food();
		f.setFoodName("Mango");
		return f;
			
	}
}
