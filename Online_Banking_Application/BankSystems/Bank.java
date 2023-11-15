package BankSystems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank {
	
	
	static final String DB_Add =  "jdbc:mysql://localhost:3306/testdb1";
	static final String USER = "root";
	static final String PASS = "Type your MySQL Password here";

	
	public String checkbalance(String account_num){

	 try(Connection con = DriverManager.getConnection(DB_Add, USER, PASS);
	  Statement st = con.createStatement();
	  ResultSet r = st.executeQuery("SELECT * FROM example1 WHERE accountnum ="+ "'" + account_num + "'");
	    ) {
	    	while(r.next()){
	    		
	    		String accountbal = r.getString("accountbal");
	    		return accountbal;
	    	}
	    }
	    
	    catch(SQLException q) {
	    	q.printStackTrace();
	  	}
	 
	return "Errors";
	}
	
	
	
	
	public double deposit(String account_num, String deposit) {
		 try(Connection con = DriverManager.getConnection(DB_Add, USER, PASS);
	  	    	  Statement st = con.createStatement();
	  	    	  ResultSet r = st.executeQuery("SELECT * FROM example1 WHERE accountnum ="+ "'" + account_num + "'");
	  	    ) {while(r.next()){
	        	     double accountbal = Double.parseDouble(r.getString("accountbal")) + Double.parseDouble(deposit);
	        		
	        		//UPDATE table_name SET field1 = new-value1, WHERE Condition
	        		 st.executeUpdate("UPDATE example1 SET accountbal ="+ "'" + accountbal + "'" + "WHERE accountnum ="+ "'" + account_num + "'");
	        		return accountbal;
	        	}
	        }
	        catch(SQLException q) {
	        	q.printStackTrace();
         	}
		 
		return 0;
	
	}
	
	
	public double withdraw(String account_num, String withdraw) {
		 try(Connection con = DriverManager.getConnection(DB_Add, USER, PASS);
	  	    	  Statement st = con.createStatement();
	  	    	  ResultSet r = st.executeQuery("SELECT * FROM example1 WHERE accountnum ="+ "'" + account_num + "'");
	  	    ) 
		 {while(r.next()){
	  	    	
	  	    	    double current_bal = Double.parseDouble(r.getString("accountbal"));

		  	  		if(current_bal>=Double.parseDouble(withdraw)) {
		  	  			double accountbal = current_bal - Double.parseDouble(withdraw);
		  	  			String accountbal_n = Double.toString(accountbal);
		  	  		    st.executeUpdate("UPDATE example1 SET accountbal ="+ "'" + accountbal_n + "'" + "WHERE accountnum ="+ "'" + account_num + "'");
		  	  		    return accountbal;
		  	  		    
					} 
		  	  		
		  	  		else {
						
					}
	  	    	    

	        	}
	        }
	        catch(SQLException q) {
	        	q.printStackTrace();
        	}
		 
		return 0;
	
	}
	
	
	
	
	
	
	
	
   /*
	
	public void deposit(String account_num, double deposit) {
		account.put(account_num, account.getOrDefault(account_num, 0.0)+deposit);
	}
	
	public void withdraw(String account_num, double withdraw) {
		if(account.containsKey(account_num)) {
			double currentbalance = account.get(account_num);
			if(currentbalance>=withdraw) {
				account.put(account_num, currentbalance-withdraw);
			} else {
				System.out.println("Insufficient fund");
			}
			System.out.println("No account");
		}
	}
	
	public void transfer(String fromAccount, String toAccount, double amount) {
	      if(account.containsKey(fromAccount) && account.containsKey(toAccount)) {
	    	   double senderbalance = account.get(fromAccount);
	    	   if(senderbalance>=amount) {
	    		   account.put(fromAccount, senderbalance-amount);
	    		   account.put(toAccount, senderbalance + amount);
	    	       System.out.println("Transfer completed");
	    	   } else {
	    		   System.out.println("No money");
	    	   }
	      } else {
	    	  System.out.println("No account");
	      }
		
	*/
	}

