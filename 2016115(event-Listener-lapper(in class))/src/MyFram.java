import javax.swing.JFrame;

public class MyFram extends JFrame {
	public MyFram(){
		this.setTitle("mouse event√≥∏Æprogram");
		this.setSize(300, 250);
		
		MyPanel mp = new MyPanel();
		this.add(mp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
