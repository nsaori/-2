
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	
	public MyPanel(){
		MyListener l = new MyListener(this);
		
		b1 = new JButton("��ġ�� ũ�� ����");
		b1.setSize(60, 20);
		b1.setLocation(51, 1);
		b1.addActionListener(l);
		
		b2 = new JButton("�������");
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setFont(new Font("���ڸ�ü", Font.ITALIC, 20));
		b2.addActionListener(l);
		
		b3 = new JButton("�۵����� ���� ��ư");
		b3.setEnabled(false);
		
		b4 = new JButton("�����/���̱�");
		b4.addActionListener(l);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
	}
	
}
