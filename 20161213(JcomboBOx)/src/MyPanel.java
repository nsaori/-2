import javax.swing.*;

public class MyPanel extends JPanel {
	public JComboBox combox;
	public JTextField txtField;
	public String[] str = { "�İ���", "�۷ι�����Ʈ�����а�", "���������а�", "���������а�" };

	public MyPanel() {
		combox = new JComboBox(str);
		this.add(combox);

		txtField = new JTextField(10);
		this.add(txtField);
		
		combox.addItemListener(new MyListener(this));
	}

}
