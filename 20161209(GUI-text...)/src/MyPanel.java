
//lactionListener lapper
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel {
	public JLabel ml1, ml2, ml3, ml4;
	public JTextField tf1, tf2, tf3;
	public JTextArea ta;

	public MyPanel() {
		ml1 = new JLabel("이름: ");
		tf1 = new JTextField(8);
		ml2 = new JLabel("학과: ");
		tf2 = new JTextField("컴퓨터공학과 ");
		tf2.setEnabled(false); // 글 바꾸지 못하게!
		ml3 = new JLabel("주소: ");
		tf3 = new JTextField("서울시...", 15);

		//ml4 = new JLabel("입력결과: ");
		ta = new JTextArea(5, 20);
		ta.setAutoscrolls(true);

		// tf1.setSize(10, 30);
		this.add(ml1);
		this.add(tf1);
		this.add(ml2);
		this.add(tf2);
		this.add(ml3);
		this.add(tf3);
		//this.add(ml4);
		this.add(ta);

		MyListener ml = new MyListener();
		tf1.addActionListener(ml);
		tf2.addActionListener(ml);
		tf3.addActionListener(ml);
		

	}

	// 글 쓰고 enter치면 label에 나오게 한다.
	public class MyListener implements ActionListener {

		String str = "";

		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField tf = (JTextField) e.getSource();
			str += " , " + tf.getText();
			//ml4.setText(str);
			ta.setText(str);
		}

	}
}
