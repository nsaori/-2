
//�Ӹ� Ŭ��~~

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyPanel extends JPanel {

	public JLabel label;

	public MyPanel() {
		this.setBackground(Color.black);
		label = new JLabel("hell");
		label.setForeground(Color.white);
		this.add(label);

		// 1. listener ��ü�� �����Ѵ�
		// 2. ����Ѵ�.
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);

			}
		});

	}
}
