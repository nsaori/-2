import java.awt.BorderLayout;

import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml1, ml2;
	public JRadioButton[] rb = new JRadioButton[3];

	public MyPanel() {
		this.setLayout(new BorderLayout());
		
		ml1 = new JLabel("���100�� ��500�� ü��20000��");
		this.add(ml1,BorderLayout.NORTH);

		rb[0] = new JRadioButton("���");
		rb[1] = new JRadioButton("��");
		rb[2] = new JRadioButton("ü��");

		ButtonGroup rbGroup = new ButtonGroup(); // radioButton grouping!!!

		for (int i = 0; i < rb.length; i++) {
			//this.add(rb[i]); // panel�� �߰�

			rbGroup.add(rb[i]); // ButtonGroup�� �߰�

			rb[i].addItemListener(new MyListener(this)); // listener���
		}
		this.add(rb[0],BorderLayout.WEST);
		this.add(rb[1],BorderLayout.CENTER);
		this.add(rb[2],BorderLayout.EAST);

		ml2 = new JLabel("0��");
		this.add(ml2,BorderLayout.SOUTH);
	}
}
