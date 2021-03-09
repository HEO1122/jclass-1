package day15.sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public JPanel pan;
	public MyFrame() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		pan = new JPanel();
		pan.setPreferredSize(new Dimension(500, 500));
		
		MouseAdapter evt = new MyEvent(this);
		
		this.pan.addMouseListener(evt);
		
		this.add(pan);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}

class MyEvent extends MouseAdapter {
	MyFrame fr;
	public MyEvent(MyFrame fr) {
		this.fr = fr;
	}
	
	public void mouseClicked(MouseEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		Color color = new Color(red, green, blue);
		
		fr.pan.setBackground(color);
	}
}