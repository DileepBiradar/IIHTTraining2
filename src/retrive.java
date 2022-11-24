
import java.sql.*;

public class retrive {
	
	static final String D_URL="jdbc:mysql://localhost:3306/employee";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="select * from student";
	
	public static void main(String[] args) {
		
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				Statement stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery(QUERY);){
			
			while(rs.next()) {
				  System.out.println("stud ID: "+rs.getInt("stud_id"));
				  System.out.println("first_NAME: "+rs.getString("first_name"));
				  System.out.println("last_NAME: "+rs.getString("last_name"));
				  System.out.println("DOB: "+rs.getString("dob"));
				  System.out.println("STANDARD: "+rs.getString("standard"));
				  System.out.println("SUBJECT: "+rs.getString("subject"));
			}
			
		}catch(SQLException e) {
		
	}
		
	}


	

}
