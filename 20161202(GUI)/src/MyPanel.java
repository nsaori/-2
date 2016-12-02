
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	
	public MyPanel(){
		
		b1 = new JButton("��ġ�� ũ�� ����");
				
		b2 = new JButton("�������");
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setFont(new Font("���ڸ�ü", Font.ITALIC, 20));
		
		b3 = new JButton("�۵����� ���� ��ư");
		b3.setEnabled(false);
		
		b4 = new JButton("�����/���̱�");
		
		MyListener ml = new MyListener(this);
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b4.addActionListener(ml);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
	}
	
}
