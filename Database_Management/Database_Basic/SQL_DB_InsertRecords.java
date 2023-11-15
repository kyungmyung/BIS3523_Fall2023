package Database_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL_DB_InsertRecords {
	
	   static final String DB_Add =  "jdbc:mysql://localhost:3306/testdb1";
	   static final String USER = "root";
	   static final String PASS = "Type your MySQL Password here";
	   
	public static void main(String[] args) {
	      try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
	    	         Statement st = conn.createStatement();) 
	      		 {		      
    	         System.out.println("Inserting records into testdb1...");          
    	         String sql = "INSERT INTO example1 VALUES ('userid1','userpass1','Starkville')";
    	         
    	         st.executeUpdate(sql);
	    	      } 
	      
	      catch (SQLException e) {
	    	         e.printStackTrace();
	    	      } 
	    	   }

	}


