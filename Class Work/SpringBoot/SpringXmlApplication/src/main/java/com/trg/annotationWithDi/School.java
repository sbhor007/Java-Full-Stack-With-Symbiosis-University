package com.trg.annotationWithDi;

import org.springframework.stereotype.Component;

@Component("schoolBean")
public class School {
	public void show() {
		System.out.println("School Show() ");
	}
}
