import java.awt.event.MouseAdapter;
import java.awt.event.*;

public class MyListener extends MouseAdapter implements MouseListener{

	public void mouseClicked(MouseEvent e) {
		
		MyPanel p = (MyPanel)e.getSource();
		//p.label.setLocation(e.getLocationOnScreen());
		p.label.setLocation(e.getPoint());
	}
}
