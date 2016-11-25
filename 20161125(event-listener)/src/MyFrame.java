

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyPanel mp;
	public MyFrame(){
		this.setTitle("Mouse event Ã³¸® progrma");
		this.setSize(300, 250);

		mp = new MyPanel();
		this.add(mp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
