package BankSystems;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;

public class JFrame_DB {
	
	static final String DB_Add =  "jdbc:mysql://localhost:3306/testdb1";
	static final String USER = "root";
	static final String PASS = "Type your MySQL Password here";

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Frame Test");
		 frame.setSize(300,300);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 frame.setLayout(new FlowLayout());
		 
		 JButton button1 = new JButton("Sign up");
	     frame.add(button1);
		 frame.setVisible(true);
		 
		 JButton button3 = new JButton("Sign in");
	     frame.add(button3);
		 frame.setVisible(true);
		 
		 JButton button5 = new JButton("Bank Account Creation");
	     frame.add(button5);
		 frame.setVisible(true);
		 

		 
	        button1.addActionListener(new ActionListener()
	        {
	            
	        	@Override
	            public void actionPerformed(ActionEvent e) 
	            {
	            
	             JFrame frame1 = new JFrame("Account Create Frame");	
	             frame1.setSize(1000,500);
	             frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
	             frame1.setLayout(new FlowLayout());
	             
	             JButton button2 = new JButton("Create Account");
	    	     JLabel label1 = new JLabel("ID: "); // ID Label
	    		 JTextField text2 = new JTextField(10);
	    		 
	    	     JLabel label2 = new JLabel("Password: "); // Password Label
	    		 JTextField text3 = new JTextField(10);
    	         JPanel panel = new JPanel();
    	         
	    	     JLabel label_bank = new JLabel("BANK ID: "); // Password Label
	    		 JTextField text_bank = new JTextField(10);
    	      
	    	     JLabel label_bank_ps = new JLabel("BANK Password: "); // Password Label
	    		 JTextField text_bank_ps = new JTextField(10);
    	         
    	         
    	         panel.add(label1);
    	         panel.add(text2);
    	         panel.add(label2);
    	         panel.add(text3);      
    	         panel.add(label_bank);
    	         panel.add(text_bank);
    	         panel.add(label_bank_ps);
    	         panel.add(text_bank_ps);
    	         
    	         panel.add(button2);  
    	         
    	
    	         
    			 JTextArea result1 = new JTextArea(10,25);
    	        
    	         frame1.add(panel);
    	         frame1.add(result1);
    	         frame1.setVisible(true);
    	         
			         button2.addActionListener(new ActionListener(){
			             @Override
			             public void actionPerformed(ActionEvent e) {
			               
			                 String id = text2.getText();
			                 String password = text3.getText();
			                 String bank_id = text_bank.getText();
			                 String bank_password = text_bank_ps.getText();
			                 

			                 if (isValidid(id) && isValidPw(password)) {
			                     result1.append("Account id and password logic is valid: " + id + '\n');
			                     
		                     try (Connection conn = DriverManager.getConnection(DB_Add, USER, PASS)) {
		                         // Check if the bank_id and bank_password exist in the database
		                         String sql = "SELECT * FROM example1 WHERE accountnum = ? AND  accountpass  = ?";
		                         try (PreparedStatement pst = conn.prepareStatement(sql)) {
		                             pst.setString(1, bank_id);
		                             pst.setString(2, bank_password);
		                             ResultSet rs = pst.executeQuery();	      

		                             if (rs.next()) {
		                                 // Matching bank_id and bank_password found, proceed with account update
		                                 String updateSql = "UPDATE example1 SET userid = ?, userpassword = ? WHERE accountnum = ? AND accountpass = ?";
		                                 try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
		                                     updateStmt.setString(1, id);
		                                     updateStmt.setString(2, password);
		                                     updateStmt.setString(3, bank_id);
		                                     updateStmt.setString(4, bank_password);
		                                     int rowsUpdated = updateStmt.executeUpdate();

		                                     // Check if any rows were updated
		                                     if (rowsUpdated > 0) {
		                                         result1.append("Account information updated successfully in the DB" + '\n');
		                                     } else {
		                                         result1.append("Failed to update account information. Please try again." + '\n');
		                                     }
		                                 }
		                             } else {
		                                 // No matching bank_id and bank_password found, display an error message
		                                 result1.append("Invalid bank ID or password. Please try again." + '\n');
		                             }
		                         }
			     	    	      } 
		                     
			     	      
			           	      catch(SQLException q) {
			           	    	q.printStackTrace();
			           	    	 result1.append("Error for updating user id password to DB" + '\n');
			           	    	 result1.append("Duplicated User ID " + '\n');
			           	    	 result1.append("set new user ID & password");
	
			     	    	      } 
	
			                     
			                 } else {
			                     result1.append("Invalid username or password. Please try again.");
			                 }
			             }
			             
			             
		                 private boolean isValidid(String username) {
		                     return username.matches("^[a-zA-Z0-9]+$"); // Allow only text and number combination
		                 }

		                 private boolean isValidPw(String password) {
		                     return password.length() >= 8; //password should be greater than 8
		                 }
			         
			         });
			        

	            	}});
	        
	        
	        
	        button3.addActionListener(new ActionListener()
	        {
	            
	        	@Override
	            public void actionPerformed(ActionEvent e) 
	            {
	            
	             JFrame frame2 = new JFrame("Login Frame");	
	             frame2.setSize(500,500);
	             frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
	             frame2.setLayout(new FlowLayout());
	             
	             JButton button4 = new JButton("Click Log in");
	    		 
	    	     JLabel label3 = new JLabel("ID: "); // "ID:" Label
	    		 JTextField text4 = new JTextField(10);
	    		 
	    	     JLabel label4 = new JLabel("Password: "); // "Password:" Label
	    		 JTextField text5 = new JTextField(10);
	    	
	    		 
    	         JPanel panel1 = new JPanel();
    	         
    	         panel1.add(label3);
    	         panel1.add(text4);
    	         panel1.add(label4);
    	         panel1.add(text5);
    	         panel1.add(button4);
    	         
    			 JTextArea result2 = new JTextArea(10,25);
    	        
    	         frame2.add(panel1);
    	         frame2.add(result2);
    	         frame2.setVisible(true);
    	         
		         button4.addActionListener(new ActionListener(){
		             @Override
		             public void actionPerformed(ActionEvent e) {
		                 String id = text4.getText();
		                 String password = text5.getText();
		                 
		                 try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
		                	     PreparedStatement pst = conn.prepareStatement("SELECT * FROM example1 WHERE userid = ? AND userpassword = ?")
		                	) {
		                	    pst.setString(1, id);
		                	    pst.setString(2, password);
		                	    ResultSet rs = pst.executeQuery();
		                	    
		                	    if (rs.next()) {
		                	        result2.setText("Login Success");
		                	        frame2.dispose();
		                	        frame.dispose(); 
		                	        
		                	        try(Connection con = DriverManager.getConnection(DB_Add, USER, PASS);
		                	  	    	  Statement st = con.createStatement();
		                	  	    	  ResultSet r = st.executeQuery("SELECT accountnum, accountbal FROM example1 WHERE userid ="+ "'" + id + "'");
		                	  	    ) {
		                	        	while(r.next()){
		                	        		
		                	        		  String accountnum = r.getString("accountnum");
		                	        		  String accountbal = r.getString("accountbal");
		                	        		  Banking b = new Banking(accountnum, accountbal);
		                	        		  Banking.main(args);
		                	        		
		                	        	}
		                	        }
		                	        
		                	        catch(SQLException q) {
		                	        	q.printStackTrace();
		   		                	}

		                	        //Banking.main(args); //Run Banking 
		                	       
		                	    } else {
		                	        result2.setText("Error for login. Please retype userid and password.");
		                	    }
		                      }
			     	      
			           	      catch(SQLException q) {
			           	    	 result2.setText("Error for login please retype userid and password");  
			     	    	         q.printStackTrace();
			     	    	      } 
		               
		             }});
	            }});
	        
	        
	        
	        
	        button5.addActionListener(new ActionListener()
	        {
	            
	        	@Override
	            public void actionPerformed(ActionEvent e) 
	            {
	            
	             JFrame frame3 = new JFrame("Bank Account Creation");	
	             frame3.setSize(1200,500);
	             frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
	             frame3.setLayout(new FlowLayout());
	             
	             JButton button6 = new JButton("Create Bank Account");
	             
	    	     JLabel label5 = new JLabel("BANK ID: "); 
	    		 JTextField text6 = new JTextField(10);
	    		 
	    	     JLabel label6 = new JLabel("BANK Password: "); // Password Label
	    		 JTextField text7 = new JTextField(10);
    	         
	    	     JLabel label7 = new JLabel("First Name: "); 
	    		 JTextField text8 = new JTextField(10);

	    	     JLabel label8 = new JLabel("Last Name: "); 
	    		 JTextField text9 = new JTextField(10);
    
	    	     JLabel label9 = new JLabel("DoB: "); 
	    		 JTextField text10 = new JTextField(10);
	    		 
	    	     JLabel label10 = new JLabel("SSN: "); 
	    		 JTextField text11 = new JTextField(10);
	    		 
	    		 
	    		 
	    		 JPanel panel = new JPanel();
	    		 
    	         panel.add(label5);
    	         panel.add(text6);
    	         panel.add(label6);
    	         panel.add(text7);
    	         panel.add(label7);
    	         panel.add(text8);
    	         panel.add(label8);
    	         panel.add(text9);
    	         panel.add(label9);
    	         panel.add(text10);
    	         panel.add(label10);
    	         panel.add(text11);
    	         
    	         
    	         panel.add(button6);
    	         
    			 JTextArea result3 = new JTextArea(10,25);
    	        
    	         frame3.add(panel);
    	         frame3.add(result3);
    	         frame3.setVisible(true);
    	         
			         button6.addActionListener(new ActionListener(){
			             @Override
			             public void actionPerformed(ActionEvent e) {
			               
			                 String bankid = text6.getText();
			                 String bankpassword = text7.getText();
			                 String firstname = text8.getText();
			                 String lastname = text9.getText();
			                 String dob = text10.getText();
			                 String ssn = text11.getText();
			                 

			           	      try(Connection conn = DriverManager.getConnection(DB_Add, USER, PASS);
			     	    	         Statement st = conn.createStatement();) 
			     	      		 {		      
	
			           	    	String sql = "INSERT INTO example1 (userid, userpassword, firstname, lastname, dob, ssn, accountnum, accountpass, accountbal) " +
			           	             "VALUES (123, 456, '" + firstname + "', '" + lastname + "', '" + dob + "', '" + ssn + "', '" + bankid + "', '" + bankpassword + "', 0)";
  
			         	         st.executeUpdate(sql);
			         	        result3.append("Bank Account created successfully inserted to DB" + '\n');
			     	    	      } 
			     	      
			           	      catch(SQLException q) {
			           	    	  
			           	    	q.printStackTrace();
			           	    	  
			           	    	 result3.append("Error for updating user id password to DB" + '\n');
			           	    	 result3.append("Duplicated User ID " + '\n');
			           	    	 result3.append("set new user ID & password");
	
			     	    	      } 
			             }
			             
			               
			         });
			        

	            	}});

	        
	        
	        
		
	}

	}


