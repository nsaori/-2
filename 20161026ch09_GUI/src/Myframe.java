//20161102 saori
//class ���� �� super class ����(jframe...)
//container(component���� ��Ƴ��� ��) / component(���)

import java.awt.*;
import javax.swing.*;	

public class Myframe extends JFrame {
	public Myframe(){
		this.setTitle("saori~");
		this.setSize(300, 180);
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.yellow);
		
		//button����
		JButton b1 = new JButton("������");
		JButton b2 = new JButton("�İ�");
		JButton b3 = new JButton("OK");
		//��ư ��ġ ( layout )	//�̰� ������ ȭ�鿡 ��ư���� ���ļ� �����ȴ�
		contentPane.setLayout(new FlowLayout()); //�ƹ��������� ������� ��ġ��Ű�� ��!
		//contentPane.setLayout(new BorderLayout());	//
		//contentPane.setLayout(new GridLayout());	//ǥ
		//contentPane.setLayout(new CardLayout());
				
		//contentPane�� ��ư ���δ�
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);	
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //necessary!!
		this.setVisible(true);
		
	}

}
