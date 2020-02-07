package com.cts.training.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {

//		Properties property = new Properties();
//
//		FileInputStream inp = new FileInputStream("details.properties");
//		
//		
//		property.load(inp);
//		System.out.println("username: " + property.getProperty("username"));

		Properties p = System.getProperties();
		p.list(System.out);

	}

}
