//20161111 saori
//myframepanel ->  panal class

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {

	public MyFrame2() {
		this.setTitle("myframe2");
		this.setSize(300, 250);
		
		MyPanal mp = new MyPanal();
		
		this.add(mp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
