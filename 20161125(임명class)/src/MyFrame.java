import java.awt.*;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyPanel panel;
	public MyFrame(){
		this.setTitle("mouse event ó�� program");
		this.setSize(300, 250);
		this.setBackground(Color.pink);	//���� ����
		
		panel = new MyPanel();
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
