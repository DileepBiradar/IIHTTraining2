
import java.sql.*;

public class retrive {
	
	static final String D_URL="jdbc:mysql://localhost:3306/democog";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="select * from student";
	
	public static void main(String[] args) {
		
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				Statement stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery(QUERY);){
			
			while(rs.next()) {
				  System.out.println("Student ID: "+rs.getInt("stud_id"));
				  System.out.println("Student NAME: "+rs.getString("stud_name"));
				  System.out.println("Student STANDARD: "+rs.getInt("stud_std"));
				  System.out.println("Student SUBJECT: "+rs.getString("stud_sub"));
				  System.out.println("Student DOB: "+rs.getDate("stud_dob"));
				  System.out.println("Student ADDRESS: "+rs.getString("stud_add"));
			}
			
		}catch(SQLException e) {
		
	}
		
	}


	

}
