package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	// Deserialization

	public static Object deserialize(String filename) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream(filename);
		BufferedInputStream bin = new BufferedInputStream(fin);
		ObjectInputStream oin = new ObjectInputStream(bin);
		Object obj = oin.readObject();
		return obj;

	}

	// Serialization

	public static void serialize(Object obj, String filename) throws IOException {
		FileOutputStream fout = new FileOutputStream(filename);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		ObjectOutputStream out = new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();

	}

	public static void main(String[] args) {

		Employee employee = new Employee(111, "Sai Ram", "Kohlapur", 22, 3243234342L, 123);
		try {
			serialize(employee, "serial.txt");
			Employee emp = (Employee) deserialize("serial.txt");
			System.out.println(emp);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
