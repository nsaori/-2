import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setTitle("마우스로 문자열 이동시키기");
		this.setSize(300, 250);
		
		MyPanel p = new MyPanel();
		this.add(p);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}
	
}
