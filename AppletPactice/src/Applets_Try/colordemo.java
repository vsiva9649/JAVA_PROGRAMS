package Applets_Try;

import java.applet.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;


/*
 <applet code="colordemo" height=300 width=300>
 </applet>
 */

public class colordemo implements ActionListener {

	Button bcolor1,bcolor2,bcolor3,bcolor4,bcolor5;
	Label bcolor;
	String str;
	public void init() {
		bcolor = new Label("Select any of the following button to change the background colour");
		bcolor1 = new Button("Red");
		bcolor2 = new Button("Blue");
		bcolor3 = new Button("Yellow");
		bcolor4 = new Button("Black");
		bcolor5 = new Button("Green");
		
		add(bcolor1);
		add(bcolor2);
		add(bcolor3);
		add(bcolor4);
		add(bcolor5);
		
		//Adding action listener to the button
		bcolor1.addActionListener(this);
		bcolor2.addActionListener(this);
		bcolor3.addActionListener(this);
		bcolor4.addActionListener(this);
		bcolor5.addActionListener(this);

	}



	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		str=ae.getActionCommand();
		repaint();

	}

	private void repaint() {
		// TODO Auto-generated method stub
		
	}


	public void paint(Graphics g) {
		
		if(str.equals("Red"))
			setBackground(Color.red);
		else if(str.equals("Blue"))
			setBackground(Color.blue);
		else if(str.equals("Yellow"))
			setBackground(Color.yellow);
		else if(str.equals("Black"))
			setBackground(Color.black);
		else if(str.equals("Green"))
			setBackground(Color.green);
	}


	private void setBackground(Color red) {
		// TODO Auto-generated method stub
		
	}
}
