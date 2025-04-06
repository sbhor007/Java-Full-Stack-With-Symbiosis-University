package com.trg.LifeCycleWithoutXml;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class CarConfig {
	@Bean(name = "CarBean")
	public Car myCarBean() {
		Car p = new Car();
		p.setId(11);
		p.setName("Santosh");
		return p;
	}

}
