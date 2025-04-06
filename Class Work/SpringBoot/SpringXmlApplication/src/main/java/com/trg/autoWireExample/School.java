package com.trg.autoWireExample;

import org.springframework.stereotype.Component;

@Component("schoolBean")
public class School {
	public void show() {
		System.out.println("School Show() ");
	}
}
