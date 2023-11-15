package JFrame_Design;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFrame_Basic1 {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Frame Test");
		 frame.setSize(300,300);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 frame.setLayout(new FlowLayout());
		 
		 JButton button1 = new JButton("Click This");
		 JTextField text1 = new JTextField(10);
		 JTextArea result1 = new JTextArea(10,25);
		 
		 frame.add(text1);
		 frame.add(text1);
		 frame.add(text1);
		 
		 frame.setVisible(true);
		 
	}

}
