import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml1, ml2;
	public JRadioButton[] rb = new JRadioButton[3];

	public MyPanel() {
		ml1 = new JLabel("���100�� ��500�� ü��20000��");
		this.add(ml1);

		rb[0] = new JRadioButton("���");
		rb[1] = new JRadioButton("��");
		rb[2] = new JRadioButton("ü��");

		ButtonGroup rbGroup = new ButtonGroup(); // radioButton grouping!!!

		for (int i = 0; i < rb.length; i++) {
			this.add(rb[i]); // panel�� �߰�

			rbGroup.add(rb[i]); // ButtonGroup�� �߰�

			rb[i].addItemListener(new MyListener(this)); // listener���
		}

		ml2 = new JLabel("�հ� 0���Դϴ�.");
		this.add(ml2);
	}
}
