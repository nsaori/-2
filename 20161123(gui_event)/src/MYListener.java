import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MYListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		MyPanel p = (MyPanel)e.getSource();
		/*
		//Point pt =  e.getLocationOnScreen();
		Point pt = e.getPoint();
		p.myl.setLocation(pt);
		*/
		int x = e.getX();
		int y = e.getY();
		p.myl.setLocation(x, y);
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//MyPanel p = (MyPanel)e.getSource();
		//p.setBackground(Color.cyan);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//MyPanel p = (MyPanel)e.getSource();
		//p.setBackground(Color.pink);

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
