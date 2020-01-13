//from class employee

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		Employee emp1 =new Employee(211, "abin", "Hyd", 22, 111568, 678809999.00);
		Employee emp2 =new Employee(212, "hasdk", "ker", 21, 2436578, 6782299.00);
		Employee emp3 =new Employee(213, "ahsdk", "and", 23, 122668, 678822999.00);
		Employee emp4 =new Employee(214, "sakjhdk", "mys", 24, 561678, 678119999.00);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println(list);//internally represents toString method of the class,we get only the address
		System.out.println();
		Collections.sort(list);
		for(Employee employee : list)
		{
			System.out.println(employee);
		}


	}

}
