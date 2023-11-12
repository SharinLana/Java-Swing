package GUISwing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkboxes extends JFrame implements ActionListener {
	JCheckBox checkBox;
	JButton button;
	ImageIcon checkedIcon, uncheckedIcon;

	public static void main(String[] args) {

		// JCheckBox - a GUI component that can be selected or deselected

		new Checkboxes();
	}

	public Checkboxes() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		// ----------- ImageIcons ------------
		
		checkedIcon = new ImageIcon("check-mark.png");
		uncheckedIcon = new ImageIcon("close.png");

		// ----------- JCheckBox ------------

		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 18));
		checkBox.setIcon(uncheckedIcon);
		checkBox.setSelectedIcon(checkedIcon);

		// ----------- JButton ------------

		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);

		// ----------- JFrame ------------

		this.setSize(450, 450);
		this.setTitle("Checkboxes");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		this.add(checkBox);
		this.add(button);

		this.pack(); // the component will fill out the entire screen
		// but to make it work, you need to comment out the setBounds() and
		// setLayout(null)
		// and the add() method must be used BEFORE pack()
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			Boolean status = checkBox.isSelected(); // returns true or false
			System.out.println("Check box status is: " + status);
		}

	}

}
