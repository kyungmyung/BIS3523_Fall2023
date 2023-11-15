package Database_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_DB_Table_Column_Creation {
	
	   static final String DB_Add = "jdbc:mysql://localhost:3306/testdb1";
	   static final String USER = "root";
	   static final String PASS = "Type your MySQL Password here";

	public static void main(String[] args) {
	      
	      try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
	         Statement st = conn.createStatement();
	      ) 
	      
	      {		      
	          String sql = "CREATE TABLE example1 " +
	                   "(userid VARCHAR(255), " +
	                   "userpassword Text,"+
	                   "firstname TEXT,"+
	                   "lastname TEXT,"+
	                   "dob TEXT,"+
	                   "ssn VARCHAR(255),"+
	                   "accountnum VARCHAR(255)," + 
	                   "accountpass TEXT,"+
	                   "accountbal float(100000,7),"+"PRIMARY KEY (userid, accountnum, ssn)"+  ")"; 
	        		 
	         st.executeUpdate(sql);
	         System.out.println("Created table in testdb1...");  	  
	      } 
	      
	      catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


