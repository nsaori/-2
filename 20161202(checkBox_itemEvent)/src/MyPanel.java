import javax.swing.*;

public class MyPanel extends JPanel {

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
}
