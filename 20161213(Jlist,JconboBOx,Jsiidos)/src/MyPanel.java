import javax.swing.*;

public class MyPanel extends JPanel {
	public JList list;
	public JTextField txtField;

	public MyPanel() {
		String[] str = { "�İ���", "�۷ι�����Ʈ�����а�", "���������а�", "���������а�" };

		list = new JList(str);
		JScrollPane scrolpane = new JScrollPane(list);
		this.add(scrolpane);

		txtField = new JTextField(10);
		this.add(txtField);

	}

}
