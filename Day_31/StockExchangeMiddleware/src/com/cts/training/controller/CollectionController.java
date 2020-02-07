package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.CollectionInterface;

public class CollectionController {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("collections.xml");
		
		CollectionInterface collection=(CollectionInterface)context.getBean("collection");
		System.out.println("List: "+collection.getList());
		
	}

}
