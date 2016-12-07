import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

//source object ������ (check box�� 3��)
//interface ���
//event source object �� event listener�� ����Ѵ�.
//Check box : ���߼��� ���� / radio box:�ϳ��� ���ð���


public class MyPanel extends JPanel implements ItemListener {

	public JLabel ml1, ml2;
	public JCheckBox[] cb = new JCheckBox[3];
	private int total = 0;
	
	public MyPanel() {
		ml1 = new JLabel("��� 100��,�� 500��,ü�� 20000�� ");
		this.add(ml1);

		String[] str = { "���", "��", "ü��" };

		// check box ���� & �߰�
		for (int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(str[i]);
			
			this.add(cb[i]);	//panel�� �߰�
			
			cb[i].addItemListener(this); //listener ���
		}

		// label �߰�
		ml2 = new JLabel("���� 0�� �Դϴ�.");
		this.add(ml2);	
	
	}

	// listener method------ml2 �� �ٲٱ�(���� ǥ��)
	// event = check box: check�� ���/�ȉ��??
	@Override
	public void itemStateChanged(ItemEvent e) {
		// JCheckBox source = (JCheckBox)e.getSource();
		// source object �������� ���������!
		int select;
		if (e.getStateChange() == ItemEvent.SELECTED) {
			select = 1;
		} else {
			select = -1;
		}

		// ���� ���
		if (e.getItem() == cb[0]) { 
			total += select * 100;	// ���
		} else if (e.getItem() == cb[1]) {
			total += select * 500; // ��
		} else {
			total += select * 20000; // ü��
		}

		ml2.setText("���� " + total +  "�� �Դϴ�.");
	}
}
