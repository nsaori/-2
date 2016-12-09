import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml1, ml2;
	public JRadioButton[] rb = new JRadioButton[3];

	public MyPanel() {
		ml1 = new JLabel("사과100원 배500원 체리20000원");
		this.add(ml1);

		rb[0] = new JRadioButton("사과");
		rb[1] = new JRadioButton("배");
		rb[2] = new JRadioButton("체리");

		ButtonGroup rbGroup = new ButtonGroup(); // radioButton grouping!!!

		for (int i = 0; i < rb.length; i++) {
			this.add(rb[i]); // panel에 추가

			rbGroup.add(rb[i]); // ButtonGroup에 추가

			rb[i].addItemListener(new MyListener(this)); // listener등록
		}

		ml2 = new JLabel("합계 0원입니다.");
		this.add(ml2);
	}
}
