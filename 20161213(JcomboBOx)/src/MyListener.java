import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class MyListener implements ItemListener {	//actionListener 도 가능한다
	MyPanel p ;
	public  MyListener(MyPanel p) {
		this.p = p;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox source = (JComboBox)e.getSource();
		//int index = source.getSelectedIndex();
		p.txtField.setText(p.str[source.getSelectedIndex()]); 

	}

}
