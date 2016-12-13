import javax.swing.*;

public class MyPanel extends JPanel {
	public JComboBox combox;
	public JTextField txtField;
	public String[] str = { "컴공과", "글로벌소프트웨어학과", "수상생명공학과", "경찰행정학과" };

	public MyPanel() {
		combox = new JComboBox(str);
		this.add(combox);

		txtField = new JTextField(10);
		this.add(txtField);
		
		combox.addItemListener(new MyListener(this));
	}

}
