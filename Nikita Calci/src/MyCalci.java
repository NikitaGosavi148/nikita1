import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyCalci {
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bdel,bdec,bclr;
	 {
		f=new JFrame("My Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20,20,300,350);
		f.setResizable(false);
		Font fo=new Font("Arial",Font.BOLD,20);
		t=new JTextField();
		t.setFont(fo);
		t.setBackground(Color.YELLOW);
		t.setForeground(Color.RED);
		t.setBounds(40,40,200,50);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		badd=new JButton("+");
		badd.setFont(fo);
		bsub=new JButton("-");
		bsub.setFont(fo);
		bdiv=new JButton("/");
		bdiv.setFont(fo);
		bmul=new JButton("*");
		bmul.setFont(fo);
		bdec=new JButton(".");
		bdec.setFont(fo);
		bdel=new JButton("Delete");
		bdel.setFont(fo);
	    bclr=new JButton("Clear");
	    bclr.setFont(fo);
	    
	    b7.setBounds(40,100,50,40);
	    b8.setBounds(90,100,50,40);
	    b9.setBounds(140,100,50,40);
	    bdiv.setBounds(190,100,50,40);
	    
	    b4.setBounds(40,140,50,40);
	    b5.setBounds(90,140,50,40);
	    b6.setBounds(140,140,50,40);
	    bmul.setBounds(190,140,50,40);
		
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(bdel);
		f.add(bclr);
		f.add(beq);
		f.add(bdec);
	 }
	 
	public static void main(String[] args) {
		new MyCalci();
		

	}

}
