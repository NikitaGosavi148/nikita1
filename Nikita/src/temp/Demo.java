package temp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo implements KeyListener {
	String msg="";
	Label l=new Label();
	Demo(){
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500, 400);
		f.add(l);
		f.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new Demo();

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
