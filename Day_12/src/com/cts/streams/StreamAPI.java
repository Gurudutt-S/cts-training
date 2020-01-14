package com.cts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		addEmployees(employees);
		// Employees with age less than 22
		List<Employee> ageScale = employees.stream()
				.filter(emp -> emp.getAge() < 22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());
		System.out.println("Employees with age less then 22:\n");
		ageScale.forEach(System.out::println);

		// name length greater than 5
		List<Employee> namelen = employees.stream().filter(emp -> emp.getName().length() > 5)
				.collect(Collectors.toList());
		System.out.println("\nName of employees whose length greater than 5: \n");
		namelen.forEach(System.out::println);
  
		// increase salary by 10%
		List<Employee> salaryhike = employees.stream().map(emp -> {
			emp.setSalary(emp.getSalary() * 1.1);
			return emp;
		}).collect(Collectors.toList());
		System.out.println("\nSalary hike:\n");
		salaryhike.forEach(System.out::println);

	}

	private static void addEmployees(List<Employee> employees) {
		Employee emp1 = new Employee(211, "Abin", "Hydrabad", 22, 2221212121L, 100);
		Employee emp2 = new Employee(101, "Anu", "Chennai", 21, 2221212121L, 200);
		Employee emp3 = new Employee(103, "Tanu", "Delhi", 23, 2221212121L, 300);
		Employee emp4 = new Employee(111, "Pruthvi", "bangalore", 19, 2221212121L, 400);
		Employee emp5 = new Employee(102, "Aniketh", "Chennai", 24, 2221212121L, 500);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

}
