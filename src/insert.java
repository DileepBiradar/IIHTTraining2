

import java.sql.*;
import java.util.Scanner;


public class insert {

	
	static final String D_URL="jdbc:mysql://localhost:3306/employee";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="insert into student (stud_id,first_NAME,last_NAME,dob,standard,subject) values(?,?,?,?,?,?);";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				Statement stmt = con.createStatement();
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter student stud_id");
			int stud_id=s.nextInt();
			System.out.println("enter student first_name");
			String firstname=s.next();
			System.out.println("enter student last_name");
			String lastname=s.next();
			System.out.println("enter student dob");
			String dob=s.next();
			System.out.println("enter student standard");
			String standard=s.next();
			System.out.println("enter student subject");
			String subject=s.next();
			
			ps.setInt(1, stud_id);
			ps.setString(2, firstname);
			ps.setString(3, lastname);
			ps.setString(4, dob);
			ps.setString(5, standard);
			ps.setString(6, subject);
			
			int b=ps.executeUpdate();
			if(b==1) {
				System.out.println("student details successfully added");
			
			}
			
			}catch(SQLException e) {
			
			
		}
	}

}
