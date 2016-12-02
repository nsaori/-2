import javax.swing.JFrame;

public class MyFram extends JFrame {

	public MyFram(){
		this.setTitle("checkBox");
		this.setSize(250, 250);
		
		this.add(new MyPanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
