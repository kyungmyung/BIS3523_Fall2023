package BankSystems;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Banking {
	
	
    public static String accountnum;
    public static String accountbal;

    public Banking(String accountnum, String accountbal) {
        this.accountnum = accountnum;
        this.accountbal = accountbal;
    }
	

    public static void main(String[] args) {
    	
    	 Bank ob1 = new Bank();
         
		 JFrame frame = new JFrame("Banking Systems");
		 frame.setSize(300,300);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 frame.setLayout(new FlowLayout());
		 
		 JButton button1 = new JButton("Check Balance");
	     frame.add(button1);
		 frame.setVisible(true);
		 
		 JButton button2 = new JButton("Deposite");
	     frame.add(button2);
		 frame.setVisible(true);
		 
		 JButton button3 = new JButton("Withdraw");
	     frame.add(button3);
		 frame.setVisible(true);
    	
		 JButton button4 = new JButton("Transfer");
	     frame.add(button4);
		 frame.setVisible(true);
    	
    	
	        button1.addActionListener(new ActionListener()
	        {@Override
	        public void actionPerformed(ActionEvent e) 
	        {
	             JFrame frame1 = new JFrame("Check Balance");	
	             frame1.setSize(500,500);
	             frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
	             frame1.setLayout(new FlowLayout());	
	             
				 JTextArea result1 = new JTextArea(10,25);
    	         frame1.add(result1);
    	         frame1.setVisible(true);
    	         accountbal = ob1.checkbalance(accountnum);
    	         result1.append("Account Number : " + accountnum + "\n");
    	         result1.append("Account Balance : " + accountbal);	
	        }});
		 
	        	
	        button2.addActionListener(new ActionListener()
	        {@Override
	        public void actionPerformed(ActionEvent e) 
	        {
	             JFrame frame2 = new JFrame("Deposite");	
	             frame2.setSize(500,500);
	             frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
	             frame2.setLayout(new FlowLayout());	
	
	    	     JLabel label1 = new JLabel("Enter your Deposite: "); // "ID:" Label
		         JTextField text1 = new JTextField(10);
		         
		         JButton button5 = new JButton("Click to deposite");
	             
		         JPanel panel1 = new JPanel();
    	         panel1.add(label1);
    	         panel1.add(text1);
    	         panel1.add(button5);
	             
				 JTextArea result1 = new JTextArea(10,25);
				 
				 frame2.add(panel1);
    	         frame2.add(result1);
    	         frame2.setVisible(true);

    		     button5.addActionListener(new ActionListener()
    		        {@Override
    		      public void actionPerformed(ActionEvent e) 
    		      {
    	         String deposite_amount = text1.getText();
    	         
    
    	         accountbal = Double.toString(ob1.deposit(accountnum, deposite_amount));
    	         result1.append("Deposite Amount : " + deposite_amount + "\n"); 
    	         result1.append("Account Number : " + accountnum + "\n");
    	         result1.append("Account Balance : " + accountbal);	
    	         
    		}});
	        }});
		 
		 
	        button3.addActionListener(new ActionListener()
	        {@Override
	        public void actionPerformed(ActionEvent e) 
	        {
	             JFrame frame3 = new JFrame("Withdraw");	
	             frame3.setSize(500,500);
	             frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
	             frame3.setLayout(new FlowLayout());	
	
	    	     JLabel label2 = new JLabel("Enter Withdraw Amount: "); // "ID:" Label
		         JTextField text2 = new JTextField(10);
		         
		         JButton button6 = new JButton("Click to Withdraw");
	             
		         JPanel panel2 = new JPanel();
	   	         panel2.add(label2);
	   	         panel2.add(text2);
	   	         panel2.add(button6);
	             
				 JTextArea result1 = new JTextArea(10,25);
				 
				 frame3.add(panel2);
				 frame3.add(result1);
				 frame3.setVisible(true);
				 
				 
	  	
	         }});
    	
	        button4.addActionListener(new ActionListener()
	           {@Override
			 public void actionPerformed(ActionEvent e) 
			     {
	             
	        	 JFrame frame4 = new JFrame("Transfer ");	
	             frame4.setSize(500,500);
	             frame4.setDefaultCloseOperation(frame4.EXIT_ON_CLOSE);
	             frame4.setLayout(new FlowLayout());	
	
	    	     JLabel label3 = new JLabel("Enter Transfer Amount: "); // "ID:" Label
		         JTextField text3 = new JTextField(10);
		         
		         JButton button7 = new JButton("Click to Transfer");
	             
		         JPanel panel3 = new JPanel();
	   	         panel3.add(label3);
	   	         panel3.add(text3);
	   	         panel3.add(button7);
	             
				 JTextArea result1 = new JTextArea(10,25);
				 
				 frame4.add(panel3);
				 frame4.add(result1);
				 frame4.setVisible(true);
       
	     }}); 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

        
        }
    }


