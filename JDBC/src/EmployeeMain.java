import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;


import java.sql.Connection;


public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int EmpId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name:");
		String fname=sc.nextLine();
		System.out.println("Enter age:");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter phone:");
		long phone=Long.parseLong(sc.nextLine());
		System.out.println("Enter department:");
		String dept=sc.nextLine();
		System.out.println("Enter location:");
		String location=sc.nextLine();
		System.out.println("Enter salary:");
		long salary=Long.parseLong(sc.nextLine());
		
		//load the driver class.
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish connection with database.
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="password";
		
		Connection conn=  DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesfull");
		
		//Prepared Statements.
		String query="insert into employee values(?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, EmpId);
		ps.setString(2,fname);
		ps.setInt(3, age);
		ps.setLong(4, phone);
		ps.setString(5, dept);
		ps.setString(6, location);
		ps.setLong(7, salary);
		 
		int result=ps.executeUpdate();
		if(result>0)
		{
			System.out.println("succesfull");
		}else
		{
			System.out.println("try again");
		}
		
		
		//create statement
//		Statement stmt= conn.createStatement();
		//String query= "insert into employee values(12,'guru',22,12334343343,'fs','thoraipakkam',3456789)";
		//String query= "update employee set location= 'kerala' where Empid='12'";
//		String query= "delete from employee where EmpId=1";
//		
//		int result=stmt.executeUpdate(query);
//		if(result>0)
//		{
//			System.out.println("Data inserted succesfully");
//		}else
//		{
//			System.out.println("Try again");
//		}
//		
//		String query="select * from employee";
//		ResultSet rs=stmt.executeQuery(query);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getLong(4)+" : "+rs.getString(5)+" : "+rs.getString(6)+" : "+rs.getLong(7));
//		}
		
		
		
	}

}
