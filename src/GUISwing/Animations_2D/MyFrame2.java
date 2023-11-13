package GUISwing.Animations_2D;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	
	MyPanel2 panel = new MyPanel2();
	
	MyFrame2() {
		
		this.setSize(500, 500);
		this.setTitle("2D Animations");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		
		this.pack(); // will fill up full screen
		this.setLocationRelativeTo(null); // the frame will appear in the middle of the computer screen
		this.setVisible(true);
	}

}
