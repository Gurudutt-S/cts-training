
public class methodOverriding {

	public static void main(String[] args) {
		//Employee employee=new Employee();
		//employee.display();
		//Manager manager=new Manager();
		//manager.display();
		Employee employee=new Manager();//Dynamic Binding/ method overrideing.
		employee.display();
	}

}

class Employee
{
	void display()
	{
		System.out.println("employee");
	}
}

class Manager extends Employee
{
	void display()
	{
		System.out.println("Manager");
	}
}
