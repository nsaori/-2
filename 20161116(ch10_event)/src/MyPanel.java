//2013110023 saori
//source object

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
	
	public JButton b;
	
	public MyPanel(){
		
		//this.setLayout(new FlowLayout());
		b = new JButton("버튼을 눌러주세요.");
		this.add(b);
		
		
	}

}
