package temp;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyevent implements KeyListener {
String msg="";
Label l=new Label();
keyevent(){
	Frame f=new Frame();
	f.setVisible(true);
	f.setSize(400,500);
	f.add(l);
	f.addKeyListener(this);
}
	public static void main(String[] args) {
		new keyevent();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		msg+=String.valueOf(e.getKeyChar());
		l.setText(msg);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
