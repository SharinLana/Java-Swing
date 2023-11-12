package GUISwing.Graphics_2D;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	
	MyPanel panel1;
	
	Frame() {
		panel1 = new MyPanel();
		
		this.setTitle("2D Graphics");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
		
		this.add(panel1);
		
		this.pack();
		this.setVisible(true);
	}
	
}