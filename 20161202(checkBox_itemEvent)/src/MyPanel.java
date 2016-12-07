import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

//source object 여러개 (check box이 3개)
//interface 경용
//event source object 에 event listener에 등록한다.
//Check box : 다중선택 가능 / radio box:하나만 선택가능


public class MyPanel extends JPanel implements ItemListener {

	public JLabel ml1, ml2;
	public JCheckBox[] cb = new JCheckBox[3];
	private int total = 0;
	
	public MyPanel() {
		ml1 = new JLabel("사과 100원,배 500원,체리 20000원 ");
		this.add(ml1);

		String[] str = { "사과", "배", "체리" };

		// check box 참조 & 추가
		for (int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(str[i]);
			
			this.add(cb[i]);	//panel에 추가
			
			cb[i].addItemListener(this); //listener 등록
		}

		// label 추가
		ml2 = new JLabel("현재 0원 입니다.");
		this.add(ml2);	
	
	}

	// listener method------ml2 글 바꾸기(가격 표시)
	// event = check box: check가 됬다/안됬다??
	@Override
	public void itemStateChanged(ItemEvent e) {
		// JCheckBox source = (JCheckBox)e.getSource();
		// source object 여러개라 딴방법으로!
		int select;
		if (e.getStateChange() == ItemEvent.SELECTED) {
			select = 1;
		} else {
			select = -1;
		}

		// 가격 계산
		if (e.getItem() == cb[0]) { 
			total += select * 100;	// 사과
		} else if (e.getItem() == cb[1]) {
			total += select * 500; // 베
		} else {
			total += select * 20000; // 체리
		}

		ml2.setText("현재 " + total +  "원 입니다.");
	}
}
