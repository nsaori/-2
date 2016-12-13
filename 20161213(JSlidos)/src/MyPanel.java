import javax.swing.*;

public class MyPanel extends JPanel {

	public JSlider slider;
	public JTextField txtField;
	public String[] str = { "컴공과", "글로벌소프트웨어학과", "수상생명공학과", "경찰행정학과" };

	public MyPanel() {
		slider = new JSlider();
		this.add(slider);

		txtField = new JTextField(10);
		this.add(txtField);
		
		slider.addItemListener(new MyListener(this));
	}
}

}
