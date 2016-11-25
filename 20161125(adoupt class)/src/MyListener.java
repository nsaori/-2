import java.awt.event.MouseAdapter;
import java.awt.event.*;

public class MyListener extends MouseAdapter{

	public MyPanel p;
	public MyListener(MyPanel p){
		this.p = p;
		
	}
	
	public void mouseClicked(MouseEvent e) {
		p.label.setLocation(e.getPoint());
	}
}
/*
public class MyListener extends MouseAdapter implements MouseListener{

	public void mouseClicked(MouseEvent e) {
		
		MyPanel p = (MyPanel)e.getSource();
		//p.label.setLocation(e.getLocationOnScreen());
		p.label.setLocation(e.getPoint());
	}
}
*/

/*
adapter class; implements의 모든 method를 사용안하도 되게 해주는 클래스

*/