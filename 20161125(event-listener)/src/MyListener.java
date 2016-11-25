import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener implements MouseListener {

	MyPanel mp;
	@Override
	public void mouseClicked(MouseEvent e) {
		mp = (MyPanel)e.getSource();
		
		int x = e.getX();
		int y= e.getY();
		mp.ml.setLocation(x, y);
		/*
		Point p = e.getPoint();
		mp.ml.setLocation(p);
		*/
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {		
		mp = (MyPanel)e.getSource();
		mp.setBackground(Color.cyan);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mp = (MyPanel)e.getSource();
		mp.setBackground(Color.magenta);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x =  e.getX();
		int y = e.getY();
		mp.lblpt.setText( "Mouse Pressed( "+ x +" , " + y + " )");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mp.lblpt.setText( "Mouse Released( "+ e.getX() +" , " + e.getY() + " )");

	}

}
