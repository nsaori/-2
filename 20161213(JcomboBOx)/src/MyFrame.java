import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setTitle("JCombpBox");
		this.setSize(300, 250);
		
		this.add(new MyPanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);;
		
	}

}
