//2013110023 노다 사오리

import javax.swing.JFrame;

public class MyFrame3 extends JFrame {

	public MyFrame3() {
		this.setTitle("2013110023 노다 사오리");
		this.setSize(300, 250);
		
		p1 p1 = new p1();
		this.add(p1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
