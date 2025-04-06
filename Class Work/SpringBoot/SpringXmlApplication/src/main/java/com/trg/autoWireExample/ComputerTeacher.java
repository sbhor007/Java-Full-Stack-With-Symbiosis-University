package com.trg.autoWireExample;

import org.springframework.stereotype.Component;

@Component
public class ComputerTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Computer Teacher Name : Gaikavad");
		
	}

}
