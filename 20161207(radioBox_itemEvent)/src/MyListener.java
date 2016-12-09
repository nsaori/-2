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

		if (arg0.getSource() == p.rb[0]) {// 사과100원
			p.ml2.setText("100원");
		} else if (arg0.getSource() == p.rb[1]) { // 배500원
			p.ml2.setText("500원");
		} else { // 체리20000원
			p.ml2.setText("20000원");
		}

	}

}
