package GUISwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Input extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;

	public static void main(String[] args) {

		// JTextField - an input field

		new Input();

	}

	public Input() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ----------- JTextField ------------

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(150, 40));
		textField.setFont(new Font("Consolas", Font.ITALIC, 16));
		textField.setForeground(new Color(0x45474B));
		textField.setBackground(new Color(0xF4CE14));
		textField.setCaretColor(new Color(0xF5F7F8)); // sets the color of the cursor (caret)
		textField.setText("Enter text...");

		// ----------- JButton ------------

		button = new JButton("Submit");
		button.setFocusable(false);
		button.setForeground(Color.white);
		button.setPreferredSize(new Dimension(60, 35));
		button.setOpaque(true);
		button.setBackground(new Color(0xF875AA));
		button.setBorder(BorderFactory.createRaisedSoftBevelBorder()); // you have to set border to set the background
																		// color
		button.addActionListener(this);

		// ----------- JFrame ------------

		this.setSize(400, 400);
		this.setTitle("Input Field");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // position + margin between items
		// FlowLayout can also be LEADING, TRALING, LEFT and RIGHT

		this.add(textField);
		this.add(button);

		this.pack(); // the component fills out the entire screen, and the add() method must be
						// BEFORE pack()
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// If button is not recognized here,
		// you must declare it as a global variable

		if (e.getSource() == button) {
			String userInput = textField.getText();
			System.out.println(userInput);

			textField.setEditable(false); // to disable the input field
			button.setEnabled(false); // to disable the button
		}

	}

}
