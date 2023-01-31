/*package temp;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyevents extends Applet implements KeyListener {

	KeyListener{ 
		 String msg=""; 
		public void init() 
		 { 
		 addKeyListener(this); 
		 } 
		 
		@Override
		public void keyPressed(KeyEvent e) { 
		 showStatus("Key Pressed"); 
		 showStatus("Key Down"); 
		 int key = e.getKeyCode(); 
		 switch(key) { 
		 case KeyEvent.VK_F1: 
		 msg += "<F1>"; 
		 break; 
		 case KeyEvent.VK_F2:msg += "<F2>"; 
		 break; 
		 case KeyEvent.VK_F3: 
		 msg += "<F3>"; 
		 break; 
		 case KeyEvent.VK_PAGE_DOWN: 
		 msg += "<PgDn>"; 
		 break; 
		 case KeyEvent.VK_PAGE_UP: 
		 msg += "<PgUp>"; 
		 break; 
		 case KeyEvent.VK_LEFT: 
		 msg += "<Left Arrow>"; 
		 break; 
		 case KeyEvent.VK_RIGHT: 
		 msg += "<Right Arrow>"; 
		 break; 
		 } 
		 
		 } 
		@Override
		public void keyReleased(KeyEvent e) { 
		 showStatus("Key Released"); 
		 
		 } 
		@Override
		public void keyTyped(KeyEvent e) { 
		 msg += e.getKeyChar(); 
		 repaint(); 
		 
		 } 
		public void paint(Graphics g) 
		 { 
		 g.drawString(msg,10,10); 
		 } 

	}
*/