import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("Swing ���� method");
		this.setSize(234, 250);
		
		MyPanel p =  new MyPanel();
		this.add(p);
		//MyListener l = new MyListener(p);	//���⼭ �ϴ°� �ƴ�
		//p.addlistener( new MyListener(p));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
