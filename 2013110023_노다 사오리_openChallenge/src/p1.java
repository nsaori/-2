//2013110023 노다 사오리

import java.awt.*;
import javax.swing.*;

public class p1 extends JPanel {

	public p1() {
		this.setLayout(new BorderLayout());
		
		this.add(new p2(),BorderLayout.NORTH);
		this.add(new p3(), BorderLayout.CENTER);
	}
}
