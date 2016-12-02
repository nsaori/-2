import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ItemListener{

	public JLabel ml1,ml2;
	public JCheckBox[] cb = new JCheckBox[3];
	
	public MyPanel(){
		ml1 = new JLabel("��� 100��,�� 500��,ü�� 20000�� ");
		this.add(ml1);
		
		String[] str = {"���","��","ü��"};
		
	    for(int i =0; i<cb.length ; i++){
	    	cb[i] = new JCheckBox(str[i]);
	    	this.add(cb[i]);
	    }
	 
		
		ml2 = new JLabel("");
		this.add(ml2);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox source = (JCheckBox)e.getSource();
		
		int count = 0;
		if(cb[0].isSelected()){
			count += 100;
		}
		if(cb[1].isSelected()){
			count += 500;
		}
		if(cb[2].isSelected()){
			count+=20000;
			
		}
		ml2.setText(count + "��");
	}
}
