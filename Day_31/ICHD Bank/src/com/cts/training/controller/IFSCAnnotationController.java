package com.cts.training.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.model.Custormer;

public class IFSCAnnotationController {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// OR
//		ApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();

		Custormer customer = (Custormer) context.getBean("custormer");
		List<String> name = new ArrayList<String>(Arrays.asList("gds", "syed", "abin"));
		customer.setName(name);
		System.out.println(customer.getName());
	}

}
