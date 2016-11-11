//2013110023 노다 사오리

import java.awt.*;

public class p2 extends Panel {
	public p2() {
		this.setLayout(new FlowLayout());
		
		this.add(new Button("Open"));
		this.add(new Button("Read"));
		this.add(new Button("Close"));
		
		setBackground(Color.LIGHT_GRAY);
	}
}
