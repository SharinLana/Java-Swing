package GUISwing;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Frame extends JFrame {
	
	// Create a constructor
	Frame() {

		this.setTitle("JFrame Lesson"); // sets the this title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
		this.setResizable(false); // prevents the this from being resized
		this.setSize(500, 500); // sets x-dimension and y-dimension of the this
		this.setVisible(true); // makes the this visible

		this.getContentPane().setBackground(new Color(146, 17, 25)); // sets the rgb background color
		this.getContentPane().setBackground(new Color(0x39A7FF)); // sets hexadecimal background color

		ImageIcon image = new ImageIcon("logo.png"); // creates an ImageIcon
		this.setIconImage(image.getImage()); // sets an image as a title icon of the this

	}

}
