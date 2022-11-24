

import java.sql.*;
import java.util.Scanner;


public class insert {

	
	static final String D_URL="jdbc:mysql://localhost:3306/democog";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="insert into student (stud_id,stud_name,stud_std,stud_sub,stud_dob,stud_add) values(?,?,?,?,?,?);";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				Statement stmt = con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter student name");
			String name=sc.next();
			System.out.println("enter student standard");
			int std=sc.nextInt();
			System.out.println("enter student subject");
			String sub=sc.next();
			System.out.println("enter student dob");
			String dob=sc.next();
			System.out.println("enter student address");
			String add=sc.next();
			
			System.out.println("enter student stud_id");
			int stud_id=sc.nextInt();
			
			ps.setInt(1, stud_id);
			ps.setString(2, name);
			ps.setInt(3, std);
			ps.setString(4, sub);
			ps.setString(5, dob);
			ps.setString(6, add);
			
			//ps.executeUpdate();
			
			int b=ps.executeUpdate();
			if(b==1) {
				System.out.println("student details successfully added");
			
			}
			
		}
			catch(SQLException e) {
			
			
		}
	}

}
