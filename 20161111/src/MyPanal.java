//20161111 saori
//myframepanel ->  panal class

import java.awt.*;
import javax.swing.*;

public class MyPanal extends JPanel {
	public MyPanal() {
		
		
		this.setLayout(new GridLayout(3, 2, 30, 25));
		
		this.add(new Button("1"));
		this.add(new Button("2"));
		this.add(new Button("3"));
		this.add(new Button("4"));
		this.add(new Button("5"));
		this.add(new Button("6"));
		
	}
}
