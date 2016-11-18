import java.awt.Color;

import javax.swing.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

 public MyPanel(MyFrame f){
	 JButton b = new JButton("move event Ã³¸®");
	 b.setBackground(Color.green);
	 
	 b.addMouseListener(f);
	 
	 this.add(b);
	 
	 
 }
}
