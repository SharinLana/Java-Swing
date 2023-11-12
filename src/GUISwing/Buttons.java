package GUISwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame implements ActionListener {
	JButton button;
	JLabel label;

	public static void main(String[] args) {
		new Buttons();

	}

	public Buttons() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		ImageIcon icon = new ImageIcon("pointer.png");
		ImageIcon icon2 = new ImageIcon("thumbsup.png");

		/* JButton - a button that performs an action when you click on it */

		button = new JButton();
		button.setBounds(150, 100, 200, 80);
		button.addActionListener(this); // to be able to see and catch the clicks on the button
		// or you can use the lambda expression to listen to the button output:
//		button.addActionListener(e -> System.out.println("poo")); 
		button.setText("Click this!");
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(-5);
		button.setFocusable(false); // removes the focus from the element
		button.setFont(new Font("Comic Sans", Font.BOLD, 20));
		button.setForeground(Color.magenta);
		button.setBorder(BorderFactory.createRaisedSoftBevelBorder());

		button.setOpaque(true);
		button.setBackground(new Color(0xCDF5FD));

		/* JLabel */
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(250, 250, 40, 40);
		label.setVisible(false);
		// AND ADD THE LABEL TO THE FRAME!!!

		/* JFrame */

		this.setSize(500, 500);
		this.setTitle("Buttons");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(button);
		this.add(label);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			// But first, make sure you created
			// button.addActionListener(this); in the Buttons constructor
			System.out.println("poo");
			button.setEnabled(false); // to disable the button after clicking on it
			label.setVisible(true); // make the label visible
		}
	}

}
