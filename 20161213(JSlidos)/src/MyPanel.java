import javax.swing.*;

public class MyPanel extends JPanel {

	public JSlider slider;
	public JTextField txtField;
	public String[] str = { "�İ���", "�۷ι�����Ʈ�����а�", "���������а�", "���������а�" };

	public MyPanel() {
		slider = new JSlider();
		this.add(slider);

		txtField = new JTextField(10);
		this.add(txtField);
		
		slider.addItemListener(new MyListener(this));
	}
}

}
