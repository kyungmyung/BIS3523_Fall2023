package JFrame_Design;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JFrame_Basic2 {
	
	public static void main(String[] args) {
		 JFrame frame = new JFrame("Frame Test");
		 frame.setSize(300,300);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 frame.setLayout(new FlowLayout());
		 
		 JButton button1 = new JButton("Click This");
		 JTextField text1 = new JTextField(10);
		 JTextArea result1 = new JTextArea(10,25);
		 
	        button1.addActionListener(new ActionListener()
	        {
	            @Override
	            public void actionPerformed(ActionEvent e) 
	            {
	            
	            
	            Thread singleThread = new Thread(() -> {
	             for(int i=1; i<=5; i++) {
	            	 result1.append("Thread count " + i + "\n");
	             }
	             
	             result1.append("Thread completed" + "\n");
	            
	            }
	            );
	            
	            singleThread.start();
	            
	            int num = Integer.parseInt(text1.getText());
	            
	            for(int i=0; i<num; i++) {
	            	result1.append("Main for Statement" + i + "\n");
	            }
	            
	            result1.append("Main for Statement Completed");
	            
	            
	            
	            }

	            
	            }
	            );
	        
		 
		 
		 
		 
		 frame.add(text1);
		 frame.add(button1);
		 frame.add(result1);
		 
		 
		 
		frame.setVisible(true);

	}

}
