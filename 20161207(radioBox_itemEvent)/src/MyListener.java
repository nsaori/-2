import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class MyListener implements ItemListener {
	MyPanel p;

	public MyListener(MyPanel p) {
		this.p = p;
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		boolean select;
		// JRadioButton source = (JRadioButton)arg0.getSource();

		if (arg0.getSource() == p.rb[0]) {// ���100��
			p.ml2.setText("100��");
		} else if (arg0.getSource() == p.rb[1]) { // ��500��
			p.ml2.setText("500��");
		} else { // ü��20000��
			p.ml2.setText("20000��");
		}

	}

}
