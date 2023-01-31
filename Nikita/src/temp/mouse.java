package temp;
import java.awt.FlowLayout; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
public class mouse implements MouseListener { 
 static JLabel j; 
 public static void main(String[] args) { 
 
 JFrame jf=new JFrame("MouseListener (Nikita Gosavi)"); 
 jf.setSize(600,600); 
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JPanel jp=new JPanel(); 
 jp.setLayout(new FlowLayout()); 
 j=new JLabel("no event"); 
 mouse m =new mouse(); 
 jf.addMouseListener(m); 
 jp.add(j); 
 jf.add(jp); 
 jf.setVisible(true); 
 } 
 @Override 
 public void mouseClicked(MouseEvent e) { 
 
 int x=e.getX(); 
 int y=e.getY(); 
 String str; 
 str="x ="+x+" ,y ="+y; 
 j.setText("Mouse Clicked (Co-ordinates)"+str); 
 
 } 
 
 public void mouseEntered(MouseEvent e) { 
 j.setText("Mouse Entered "); 
 j.setVisible(true); 
 } 
 @Override 
 public void mouseExited(MouseEvent e) { 
 j.setText("Mouse exited"); 
 j.setVisible(false); 
 } 
 @Override 
 public void mousePressed(MouseEvent e) { 
 j.setText("Mouse Pressed"); 
 
 } 
 @Override 
 public void mouseReleased(MouseEvent e) { 
 j.setText("Mouse Released"); 
 
 } 
} 