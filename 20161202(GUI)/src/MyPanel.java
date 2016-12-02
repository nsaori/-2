
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	
	public MyPanel(){
		MyListener l = new MyListener(this);
		
		b1 = new JButton("위치와 크기 정보");
		b1.setSize(60, 20);
		b1.setLocation(51, 1);
		b1.addActionListener(l);
		
		b2 = new JButton("모양정보");
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setFont(new Font("이텔릭체", Font.ITALIC, 20));
		b2.addActionListener(l);
		
		b3 = new JButton("작동하지 않은 버튼");
		b3.setEnabled(false);
		
		b4 = new JButton("숨기기/보이기");
		b4.addActionListener(l);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
	}
	
}
