import javax.swing.*;

public class MyPanel extends JPanel {

	public JLabel myl;
	public MyPanel(){
	    myl = new JLabel("label");
		myl.setLocation(50, 50);
		
		this.add(myl);
		
		MYListener mlsnr = new MYListener();
		myl.addMouseListener(mlsnr);
		
	}
}
