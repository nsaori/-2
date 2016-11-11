//20161102 saori
//class 만들 떄 super class 지정(jframe...)
//container(component들을 모아놓은 것) / component(요소)

import java.awt.*;
import javax.swing.*;	

public class Myframe extends JFrame {
	public Myframe(){
		this.setTitle("saori~");
		this.setSize(300, 180);
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.yellow);
		
		//button샹성
		JButton b1 = new JButton("선문대");
		JButton b2 = new JButton("컴공");
		JButton b3 = new JButton("OK");
		//버튼 배치 ( layout )	//이게 없으면 화면에 버튼들이 겁쳐서 생성된다
		contentPane.setLayout(new FlowLayout()); //아무생각없이 순서대로 배치시키는 것!
		//contentPane.setLayout(new BorderLayout());	//
		//contentPane.setLayout(new GridLayout());	//표
		//contentPane.setLayout(new CardLayout());
				
		//contentPane에 버튼 붙인다
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);	
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //necessary!!
		this.setVisible(true);
		
	}

}
