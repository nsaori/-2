import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener implements KeyListener {

	MyPanel p;
	public MyListener(MyPanel p){
		this.p = p;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		
		p.labels[0].setText( keyCode +"" );	//Integer.toString(keyCode)
		p.labels[1].setText( arg0.getKeyChar() +"" );	//ICharactor.toString(arg0.getKeyChar())
		p.labels[2].setText( arg0.getKeyText(keyCode) );

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("keyReleased");

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("keyTyped");
	}

}
