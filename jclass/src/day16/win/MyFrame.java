package day16.win;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame {
	public JFrame fr;
	public JPanel pan, blPan;
	private JButton btn1, btn2;
	
	public MyFrame() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		
		pan = new JPanel();
		
		blPan = new JPanel(new BorderLayout());
		blPan.setSize(450, 30);
		
		btn1 = new JButton("exit");
		btn1.setPreferredSize(new Dimension(225, 30));
		btn2 = new JButton("change");
		btn2.setPreferredSize(new Dimension(225, 30));
		
		blPan.add(btn1, BorderLayout.WEST);
		blPan.add(btn2, BorderLayout.EAST);
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(blPan, BorderLayout.SOUTH);
		fr.setSize(450,480);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
