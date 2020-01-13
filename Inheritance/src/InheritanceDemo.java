import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.getData();
		manager.display();
		
	}

}

class Employee
{
	int id;
	String name;
	String company;
	
	public void display()
	{
		System.out.println("ID: "+id+"	Name: " +name+ "	Company: "+company );
	}
	
	public void getData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the ID:");
		id=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the name:");
		name=scanner.nextLine();
		System.out.println("Enter the company");
		company=scanner.nextLine();
	}
}

class Manager extends Employee
{
	String [] team=new String[5]; 
	String department;
	
	public void getData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter team name");
		for(int i=0;i<5;i++)
		{
			team[i]=scanner.nextLine();
		}
		System.out.println("Enter the department");
		department=scanner.nextLine();
	}
	
	public void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Team: "+team[i]);
		}
		System.out.println(" Department: "+department);
	}
}

class Developer extends Employee
{
	String projectname;
	String duration;
	String domain;
	
	public void getData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Project Name");
		projectname=scanner.nextLine();
		System.out.println("Enter the Duration");
		duration=scanner.nextLine();
		System.out.println("Enter the Domain");
		domain=scanner.nextLine();
	}
	
	public void display()
	{
		System.out.println("Project name: "+projectname+" Duration: "+duration+ "  Domain" +domain);
	}
}
