//20161111 saori

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("20161111 saori");
		this.setSize(300, 250);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		
		FlowLayout f1 = new FlowLayout();
		Container cp = this.getContentPane();
		
		cp.setLayout(f1);
		
		//ºÙ¿©Áà¾ßÁö~~
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
