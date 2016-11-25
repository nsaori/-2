import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml;
	public JLabel lblpt;
	public MyPanel(){
		ml = new JLabel("hello");
		ml.setLocation(130, 100);
		lblpt = new JLabel();
		
		this.add(ml);
		this.add(lblpt);
		
		MyListener listener = new MyListener();
		this.addMouseListener(listener);
	
		
	}
}
