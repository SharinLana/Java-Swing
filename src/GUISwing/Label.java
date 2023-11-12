package GUISwing;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

public class Label extends JFrame {

	public static void main(String[] args) {
		new Label();
	}

	public Label() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		/* JLabel - a GUI display area for a text, image or both */

		JLabel label = new JLabel();

		ImageIcon image = new ImageIcon("globus.png");
		Border border = BorderFactory.createLineBorder(new Color(0x3D30A2), 2); // 2 is the border width

		label.setText("Sis, do you even code?"); // sets the text of the label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // sets the text on the LEFT, CENTER, RIGHT of the image
		label.setVerticalTextPosition(JLabel.BOTTOM); // sets the text at the TOP, CENTER or BOTTOM of the image
		label.setForeground(new Color(0x3D30A2)); // sets the text color
		label.setFont(new Font("MV Boli", Font.PLAIN, 14)); // sets font
		label.setIconTextGap(-1); // sets a gap of text to image (the number can be negative or positive)

		label.setBackground(new Color(0xFFFB73)); // sets the background color
		label.setOpaque(true); // display the background color

		label.setBorder(border); // sets border of label (not image + text)

		label.setVerticalAlignment(JLabel.CENTER); // places the text with the image at the TOP, CENTER or BOTTOM of the
													// frame
		label.setHorizontalAlignment(JLabel.CENTER); // like justify-content (LEFT, CENTER, RIGHT)
		label.setBounds(20, 20, 200, 250); // it's like a div: sets the component position in the frame (left, top,
											// width, height)
		// after that, you must use the following commands in the JFrame section below
		// this.setLayout(null);
		// this.add(label);

		/* JFrame */

		this.setSize(400, 400);
		this.setTitle("Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ADD THE LABEL TO THE FRAME !!! Otherwise, it won't be visible
		this.setLayout(null); // to separate the label component (including the image, border and background
								// color) from the frame
		this.add(label);
//		this.pack(); // this method make sure that the component fills out the entire screen
		// but to make it work, you need to comment out the setBounds() and setLayout(null)
		// and the add() method must be used BEFORE pack()

		this.setVisible(true);

	}

}
