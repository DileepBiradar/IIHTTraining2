

import java.sql.*;
import java.util.Scanner;

public class Update {

	static final String D_URL="jdbc:mysql://localhost:3306/democog";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="update student set stud_std =? where stud_id=?;";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
			Scanner s =new Scanner(System.in);
			
			System.out.println("enter student stud_id");
			int stud_id =s.nextInt();
			System.out.println("enter stud_std to update");
		    int stud_std=s.nextInt();
			
			ps.setInt(1, stud_std);
			ps.setInt(2, stud_id);
			
			int b= ps.executeUpdate();
			
			if(b==1) {
				System.out.println("Student standard successfully update");
				
			}
			else {
				System.out.println("No Student found the id");
			}
		}catch(SQLException e) {
			
		}
	}

}
