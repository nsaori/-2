//2013110023 ��� �����
//source object

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		this.setTitle("2013110023 ��� �����");
		this.setSize(300, 250);
		
		MyPanel p = new MyPanel();
		this.add(p);
		
		//4.listener object�� ����Ѵ�.
		MyListener ml = new MyListener();
		p.b.addActionListener(ml);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}