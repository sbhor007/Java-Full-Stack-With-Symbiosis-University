package com.trg.springCoreWithAnnotations.AnnotaionsExample;

import org.springframework.stereotype.Component;

@Component
public class ScanEmployee {
	public void printEmployeeName(String name) {
		System.out.println(name);
	}
}
