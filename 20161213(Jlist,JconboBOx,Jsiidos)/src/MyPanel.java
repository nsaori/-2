import javax.swing.*;

public class MyPanel extends JPanel {
	public JList list;
	public JTextField txtField;
	public String[] str = { "컴공과", "글로벌소프트웨어학과", "수상생명공학과", "경찰행정학과" };

	public MyPanel() {
		//str = { "컴공과", "글로벌소프트웨어학과", "수상생명공학과", "경찰행정학과" };

		list = new JList(str);
		JScrollPane scrolpane = new JScrollPane(list);	/////
		this.add(scrolpane);	/////
		list.addListSelectionListener(new MyListener(this));

		txtField = new JTextField(10);
		this.add(txtField);

	}

}
