import javax.swing.JButton;
import javax.swing.JPanel;



public class MyPabel extends JPanel {

	public JButton b;
	public MyPabel(){
		b = new JButton("��ư�� �����ֻ���.");
		this.add(b);
		
		/*
		MyListener ml = new MyListener();
		b.addActionListener(ml);
		*/
	}
}