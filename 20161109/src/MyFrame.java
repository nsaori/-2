//20161109 saori
//jframe = component , container
//contentPane.setLayout(new FlowLayout()); //�ƹ��������� ������� ��ġ��Ű�� ��!
//contentPane.setLayout(new BorderLayout());	//
//contentPane.setLayout(new GridLayout());	//ǥ
//contentPane.setLayout(new CardLayout());

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		this.setTitle("2013110023 saori");
		this.setSize(300,250);
		
		Container cp = this.getContentPane();
		
		FlowLayout f1 = new FlowLayout();
		cp.setLayout(f1);
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
