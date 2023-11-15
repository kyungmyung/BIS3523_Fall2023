package Database_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQL_DB_DeleteRecords {
	
	static final String DB_Add =  "jdbc:mysql://localhost:3306/testdb1";
	static final String USER = "root";
	static final String PASS = "Type your MySQL Password here";
	static final String Q = "SELECT * FROM testdb1.example1";
	

	public static void main(String[] args) {
		
	      try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
		    	  Statement st = conn.createStatement();
		  
		    	) 
	      		 {		
	    	  
	    	     String sql = "DELETE FROM example1 WHERE userid ='userid1'";
	             st.executeUpdate(sql);
	    	     ResultSet rs = st.executeQuery(Q);
	             
	    	     while(rs.next()){
	            	  System.out.print("User ID: "+ rs.getString("userid"));
	            	  System.out.print(", User Password: "+ rs.getString("userpassword"));
	            	  System.out.println(", User Address: "+ rs.getString("useraddress"));
	              }
	    	      } 
		      
		      catch (SQLException e) {
		    	         e.printStackTrace();
		    	      } 
		    	   }
		
	}


