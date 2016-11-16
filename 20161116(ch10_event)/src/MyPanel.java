//2013110023 saori

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	public MyPanel(){
		
		this.setLayout(new FlowLayout());
		
		this.add(new Button("버튼을 눌러주세요."));
	}

}
