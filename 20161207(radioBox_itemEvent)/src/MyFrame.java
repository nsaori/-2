import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("radioBox item Event");
		this.setSize(250, 250);
		
		this.add(new MyPanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
