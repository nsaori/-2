import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyPanel extends JPanel {

	public JButton b,b1 ;
	public MyPanel(){
		
		this.setLayout(new FlowLayout());
		
	     b = new JButton("Mouse Event Ã³¸®");
	     b.setBackground(Color.yellow);
		this.add(b);
		
		b1 = new JButton();
		b1.setSize(80,30);
		this.add(b1);
		
	}
}
