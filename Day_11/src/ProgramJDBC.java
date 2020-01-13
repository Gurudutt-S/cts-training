

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;;

public class ProgramJDBC {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="password";
		
		Connection conn= DriverManager.getConnection(url,username,password);
		System.out.println("Succesfull");
		
		//inserting elements
//		Statement stmt=conn.createStatement();
//		String query="insert into employee values(7,'asd',25,12345555433,'ai','in',12312312313)";
//		
//		int result=stmt.executeUpdate(query);
//		if(result>0)
//		{
//			System.out.println("Data inserted succesfully");
//		}else
//		{
//			System.out.println("Try again");
//		}
		
		//deleting elements
//		Statement stmt=conn.createStatement();
//		String query="delete from employee where EmpId=13";
//		int result=stmt.executeUpdate(query);
//		if(result>0)
//		{
//			System.out.println("Deleted");
//		}else
//		{
//			System.out.println("Try again");
//		}
		
		//using resultSet
//		ResultSet rs= stmt.executeQuery(query);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+" : " +rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getLong(4)+" : "+rs.getString(5)+" : "+rs.getString(6)+" : "+rs.getLong(7));
//		}
//		
		
		
		
		
		
		

	}

}
