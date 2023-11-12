package GUISwing.OpenNewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	// 5. Create global variables
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");

	NewWindow() {
		
		label.setBounds(100, 100, 150, 150);
		label.setFont(new Font(null, Font.PLAIN, 20));

		// -------- JFrame ---------

		frame.setSize(420, 420);
		frame.setTitle("Launch Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // we will set the position of the element(s) manually, using setBounds()

		frame.add(label);

		frame.setVisible(true);

	}
}
