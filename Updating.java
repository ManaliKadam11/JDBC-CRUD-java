import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updating {
public static void main(String[]args) {
	String url = "jdbc:mysql://localhost:3306/javabatch";
	String username = "root";
	String password = "root";
	
	Connection connection = null;
	
//	STEP 1: Load/Register the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");     
		
//	STEP 2: Establish Connection
		 connection = DriverManager.getConnection(url, username, password);
		
//	STEP 3:	Establish Statement 
		Statement statement = connection.createStatement();
		
//	STEP 4: Execute the Statement 
		 int a = statement.executeUpdate("UPDATE student SET name='Manali' WHERE ID=1");
		 
		 if(a > 0) {
			 System.out.println("Updated");
		 }else {
			 System.out.println("Not Updated");
		 }
		
//	STEP 5: Close Connection
		
		
	
		
	} catch (ClassNotFoundException e) {  
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			connection.close();
			System.out.println("All Good");
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
	
}
