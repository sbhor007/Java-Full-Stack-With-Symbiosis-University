package com.trg.springCoreWithAnnotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	public void collegeName() {
		System.out.println("My College name is CMCS");
	}

}
