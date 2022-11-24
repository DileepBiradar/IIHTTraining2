import java.sql.*;
import java.util.Scanner;

public class Delete {
	
	static final String D_URL="jdbc:mysql://localhost:3306/employee";
	static final String USER="root";
	static final String PASS="root";
	static final String QUERY="delete from student where id=?";
	
	
	public static void main(String[] args) {
		try(Connection con =DriverManager.getConnection(D_URL, USER, PASS);
				PreparedStatement ps=con.prepareStatement(QUERY);){
			
			Scanner s =new Scanner(System.in);
			System.out.println("enter student stud_id");
			int stud_id =s.nextInt();
			ps.setInt(1, stud_id);
			
           int b= ps.executeUpdate();
			
			if(b==1) {
				System.out.println("Student successfully deleted");
				
			}
			else {
				System.out.println("No Student found the id");
			}
		}catch(SQLException e) {
			
		}
	}

}

