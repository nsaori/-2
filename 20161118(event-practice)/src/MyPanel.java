import java.awt.Color;

import javax.swing.*;

public class MyPanel extends JPanel {

	public JButton b ;
	public MyPanel(){
	     b = new JButton("Mouse Event ó��");
	     b.setBackground(Color.yellow);
		this.add(b);
		
	}
}
