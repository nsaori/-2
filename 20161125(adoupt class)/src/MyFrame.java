import javax.swing.*;

public class MyFrame extends JFrame {
	MyPanel p ;
	public MyFrame(){
		this.setTitle("mouse event Ã³¸®program with mouseAdouptor class");
		this.setSize(300, 250);
		
		p = new MyPanel();
		this.add(p);
		
		MyListener lietener = new MyListener();
		p.addMouseListener(lietener);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
