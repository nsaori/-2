import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml;
	public MyPanel(){
		ml = new JLabel("hello");
		this.add(ml);
		
		MyListener listener = new MyListener();
		this.addMouseListener(listener);
	
	}
}
