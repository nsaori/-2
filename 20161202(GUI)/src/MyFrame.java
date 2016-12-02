import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("Swing 공동 method");
		this.setSize(234, 250);
		
		MyPanel p =  new MyPanel();
		this.add(p);
		//MyListener l = new MyListener(p);	//여기서 하는게 아님
		//p.addlistener( new MyListener(p));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
