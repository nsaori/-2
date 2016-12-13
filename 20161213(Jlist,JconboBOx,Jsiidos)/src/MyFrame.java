import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setTitle("JList");
		this.setSize(300, 250);
		
		this.add(new MyPanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
