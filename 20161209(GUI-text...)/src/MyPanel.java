import javax.swing.*;


public class MyPanel extends JPanel {
	public JLabel ml1,ml2,ml3,ml4;
	public JTextField tf1,tf2,tf3;
	
	public MyPanel(){
		ml1 = new JLabel("이름: ");
		tf1 = new JTextField(8);
		ml2 = new JLabel("학과: ");
		tf2 = new JTextField("컴퓨터공학과 ");
		tf2.setEnabled(false); //글 바꾸지 못하게!
		ml3 = new JLabel("주소: ");
		tf3 = new JTextField("서울시...",15);
		
		//tf1.setSize(10, 30);
		this.add(ml1);
		this.add(tf1);
		this.add(ml2);
		this.add(tf2);
		this.add(ml3);
		this.add(tf3);
		
		ml4 = new JLabel();
		this.add(ml4);
		
	}
}
