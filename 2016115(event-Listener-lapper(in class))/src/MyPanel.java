//lapper ; class안에 또 하나의 class집어놓기

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyPanel extends JPanel {

	public JLabel ml;

	public MyPanel() {
		ml = new JLabel("hell");
		this.add(ml);
		this.addMouseListener(new MyListener());

	}

	public class MyListener implements MouseListener {

		Color originClr;

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			//ml.setText("mouseClicked( " + x + " , " + y + " )");
			ml.setLocation(x, y);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// originClr ;

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
