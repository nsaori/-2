import java.awt.BorderLayout;

import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml1, ml2;
	public JRadioButton[] rb = new JRadioButton[3];

	public MyPanel() {
		this.setLayout(new BorderLayout());
		
		ml1 = new JLabel("사과100원 배500원 체리20000원");
		this.add(ml1,BorderLayout.NORTH);

		rb[0] = new JRadioButton("사과");
		rb[1] = new JRadioButton("배");
		rb[2] = new JRadioButton("체리");

		ButtonGroup rbGroup = new ButtonGroup(); // radioButton grouping!!!

		for (int i = 0; i < rb.length; i++) {
			//this.add(rb[i]); // panel에 추가

			rbGroup.add(rb[i]); // ButtonGroup에 추가

			rb[i].addItemListener(new MyListener(this)); // listener등록
		}
		this.add(rb[0],BorderLayout.WEST);
		this.add(rb[1],BorderLayout.CENTER);
		this.add(rb[2],BorderLayout.EAST);

		ml2 = new JLabel("0원");
		this.add(ml2,BorderLayout.SOUTH);
	}
}
