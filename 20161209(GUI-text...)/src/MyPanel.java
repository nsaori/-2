import javax.swing.*;


public class MyPanel extends JPanel {
	public JLabel ml1,ml2,ml3,ml4;
	public JTextField tf1,tf2,tf3;
	
	public MyPanel(){
		ml1 = new JLabel("�̸�: ");
		tf1 = new JTextField(8);
		ml2 = new JLabel("�а�: ");
		tf2 = new JTextField("��ǻ�Ͱ��а� ");
		tf2.setEnabled(false); //�� �ٲ��� ���ϰ�!
		ml3 = new JLabel("�ּ�: ");
		tf3 = new JTextField("�����...",15);
		
		//tf1.setSize(10, 30);
		this.add(ml1);
		this.add(tf1);
		this.add(ml2);
		this.add(tf2);
		this.add(ml3);
		this.add(tf3);
		
		ml4 = new JLabel();
		this.add(ml4);
		
	}
}
