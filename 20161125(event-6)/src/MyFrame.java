import javax.swing.*;

public class MyFrame extends JFrame {

	public MyPanel p;
	public MyFrame(){
		this.setTitle("Key eventó��program");
		this.setSize(300, 250);
		
		p = new MyPanel();
		this.add(p);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
