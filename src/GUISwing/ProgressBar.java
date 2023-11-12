package GUISwing;

import java.awt.*;
import javax.swing.*;

public class ProgressBar {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();

	public static void main(String[] args) {

		// Progress bar - a visual aid to let the user know that an operation is
		// processing

		new ProgressBar();
	}

	public ProgressBar() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// --------- JProgressBar -----------

		bar.setValue(0); // initial value = 0
		bar.setBounds(40, 0, 420, 50); // left, top, width, height
		bar.setStringPainted(true); // this adds the % sign to the bar
		bar.setFont(new Font("MV Boli", Font.BOLD, 20));
//		bar.setOpaque(true);
//		bar.setForeground(Color.red);
//		bar.setBackground(Color.black);

		// --------- JFrame -----------

		frame.setSize(500, 500);
		frame.setTitle("Progress Bar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		frame.add(bar);

		frame.setVisible(true);

		// ALL CUSTOM METHODS HAVE TO BE PLACED AT THE END OF THE CONSTRUCTOR!
		// Otherwise, they will not be working properly
		
		fill(); // custom method created below.

	}

	public void fill() {
		int counter = 100;

		while (counter >= 0) {
			bar.setValue(counter);

			try {
				Thread.sleep(50); // this will pause the wile loop for a second after each iteration

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			counter--;

		}
		
		bar.setString("DONE!");
	}

}
