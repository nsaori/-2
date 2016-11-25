import javax.swing.*;

public class MyPanel extends JPanel {

	public JLabel[] labels;
	public MyPanel(){
		labels = new JLabel[3];
		
		labels[0] = new JLabel("getKeyCode()");
		labels[1] = new JLabel("getKeyChar()");
		labels[2] = new JLabel("getKeyText()");
		
		for (JLabel jLabel : labels) {
			this.add(jLabel);
		}
		
		this.setFocusable(true);
		
		MyListener l = new MyListener(this);
		this.addKeyListener(l);
		//this.addKeyListener(new MyListener(this));
		
	}
}
