//20161111 saori

import javax.swing.*;
import java.awt.*;

public class MyFramePanel extends JFrame {

	public MyFramePanel() {
		this.setTitle("panel");
		this.setSize(300, 250);
		
		//panel------------------------------------
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2, 30, 25));
		
		p.add(new Button("1"));
		p.add(new Button("2"));
		p.add(new Button("3"));
		p.add(new Button("4"));
		p.add(new Button("5"));
		p.add(new Button("6"));
		
		this.add(p);
		//----------------------------------------//
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
