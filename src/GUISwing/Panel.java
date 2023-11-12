package GUISwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JFrame {

	public static void main(String[] args) {
		new Panel();

	}

	public Panel() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		ImageIcon icon = new ImageIcon("thumbsup.png");

		JLabel label = new JLabel();
		label.setText("Welcome!");
		label.setForeground(new Color(0xFCF5ED));
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.LEFT); // sets the text on the LEFT, CENTER, RIGHT of the image
		label.setVerticalTextPosition(JLabel.CENTER); // to the image

		// Have to use setHorizontalAlignment and/or setVerticalAlignment
		// if the panel's setLayout(new BorderLayout())
		label.setHorizontalAlignment(JLabel.CENTER); // like justify-content (LEFT, CENTER, BOTTOM)

		label.setBounds(45, 60, 150, 75); // valid only if the panel's setLayout(null)

		/*
		 * JPanel - a GUI component that works as a container to hold other components
		 * (like a <div></div> in HTML, and the frame acts like <body></body>)
		 */

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250); // (left, top, width, height)

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250); // (left, top, width, height)
		bluePanel.setLayout(new BorderLayout()); // places the label on the central-left position of the panel
		bluePanel.add(label);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250); // (left, top, width, height)
		greenPanel.setLayout(null); // if it's null, then label has to have the setBounds method
		greenPanel.add(label);

		/* JFrame */

		this.setSize(750, 750);
		this.setTitle("Panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ADD THE PANEL TO THE FRAME !!! Otherwise, it won't be visible
		this.setLayout(null); // to separate the frame from panels
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);

		this.setVisible(true);

	}

}
