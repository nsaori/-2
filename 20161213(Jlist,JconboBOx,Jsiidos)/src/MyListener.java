import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;

public class MyListener implements ListSelectionListener {
	MyPanel p;

	public MyListener(MyPanel p) {
		this.p = p;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		JList source = (JList) e.getSource();
		int index = source.getSelectedIndex();
		p.txtField.setText(p.str[index]); 
	}

}
