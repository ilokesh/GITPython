import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.Utility;

public class Employeeuploader {
	int deptid;
	String depname;
	String depthead;
	String deptdescription;
	static Connection con = null;
	static	 PreparedStatement pstmt = null;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Employeeuploader emp=new Employeeuploader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries");
		int n = sc.nextInt();

		for(int i=0;i<n;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter ID");
			int id= sc1.nextInt();
			System.out.println("Enter the dept name");
			String s1 = sc1.next();
			System.out.println("Enter the name of the employee");
			String s2 = sc1.next();
			System.out.println("Enter the description");
			String s3 = sc1.next();

			System.out.println();
			// emp.storeDepartmentDetails(id, s1, s2, s3);
			System.out.println("data succesfully entered");
			System.out.println();
			System.out.println("thank you have a nice day");

			// sc1.close();
		}

	}
	public static void storeDepartmentDetails(int deptid,String depname, String depthea, String deptdescription) throws SQLException, ClassNotFoundException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jdbc","root","root");  
		String sql = "insert into dept values(?,?,?,?)";

		try {
			pstmt =  con.prepareStatement(sql);
			pstmt.setInt(1,deptid );
			pstmt.setString(2,depname);
			pstmt.setString(3,depthea);
			pstmt.setString(4, deptdescription);
			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally{
			if(pstmt!=null)
			{ pstmt.close();

			}if (con != null) {
				con.close();
			}
			{

			}
		}
	}

	public static void storeEmployeeDetails( ) 
	{		Employeeuploader emp=new Employeeuploader();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of entries");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of entries");
		int n = sc1.nextInt();

		for(int i=0;i<n;i++)
		{
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter employee ID");
			int id= sc1.nextInt();
			System.out.println("Enter the employee  name");
			String s1 = sc1.next();
			System.out.println("Enter the employee adress");
			String s2 = sc1.next();
			System.out.println("Enter the employee salary");
			double s3 = sc1.nextDouble();
			System.out.println("Enter the employee contact number");
			int s4 = sc1.nextInt();
			System.out.println("enter dept Id");
			int s5 = sc1.nextInt();


			System.out.println();
			// emp.storeDepartmentDetails(id, s1, s2, s3);
			System.out.println("data succesfully entered");
			System.out.println();
			System.out.println("thank you have a nice day");

			// sc1.close();
		}
		{


		}
	}

}

