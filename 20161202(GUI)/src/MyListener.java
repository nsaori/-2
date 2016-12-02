
//ActionListener -> adapter class 없다

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyListener implements ActionListener {

	private MyPanel p;
	
	public MyListener(MyPanel p) {
		this.p = p;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton b = (JButton)arg0.getSource();
		
		if(b == p.b1 ){	//b1 선택
			System.out.println("버튼의 위치와 크기");
			System.out.println("위치 = (" + b.getX() + " , " + b.getY() + " )" );
			System.out.println("크기 = (" + b.getWidth() + " , " + b.getHeight() + " )" );
			System.out.println("크기 = " + b.getSize() + "\n");
			
		}else if(b == p.b2){	//b2 선택
			System.out.println(b.getFont() + "\n");
			
		}else{	//b3 선택; hide,show
			//if(p.b1.isVisible() == true)
			p.b1.setVisible(!p.b1.isVisible());
			p.b2.setVisible(!p.b2.isVisible());
			p.b3.setVisible(!p.b3.isVisible());
			
		}
	}

}
