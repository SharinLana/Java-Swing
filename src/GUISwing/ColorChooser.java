package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;

	public static void main(String[] args) {

		// JColorChooser - a GUI mechanism that lets a user to choose a color

		new ColorChooser();

	}

	public ColorChooser() {
		
		// ----------- JButton ------------
		
		button = new JButton("Choose a color");
		button.addActionListener(this);
		
		
		// ----------- JLabel ------------
		
		label = new JLabel();
		label.setText("This is some text!");
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setFont(new Font("Arial", Font.PLAIN, 100));
		

		// ----------- JFrame ------------

		this.setTitle("Color Chooser");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(label);

		this.pack(); // the component will fill out the entire screen
		// but to make it work, you need to comment out the setBounds() and
		// setLayout(null)
		// and the add() method must be used BEFORE pack()
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
			JColorChooser colorChooser = new JColorChooser();
			
			// Create a dialog box:
			Color color = JColorChooser.showDialog(null, "Pick a color...", Color.black); // parentComponent title, initialColor
			
			// Reset a background color for the label:
//			label.setBackground(color);
			
			// Or a foreground color:
			label.setForeground(color);
		}
		
	}

}
