package GUISwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener {

	JRadioButton pizzaBtn, hamburgerBtn, hotDogBtn;
	ImageIcon pizzaIcon, hamburgerIcon, hotDogIcon;

	public static void main(String[] args) {

		// JRadioButton - one or more buttons in a group.
		// Only one button from the group may be selected

		new RadioButton();

	}

	public RadioButton() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		// ----------- ImageIcons ------------
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("hot-dog.png");
		hotDogIcon = new ImageIcon("humburger.png");

		// ----------- JRadioButtons ------------

		pizzaBtn = new JRadioButton("Pizza");
		pizzaBtn.setIcon(pizzaIcon);
		hamburgerBtn = new JRadioButton("Hamburger");
		hamburgerBtn.setIcon(hamburgerIcon);
		hotDogBtn = new JRadioButton("Hot Dog");
		hotDogBtn.setIcon(hotDogIcon);
		
		// Currently, we can select all of the buttons at once.
		// To limit the choice to just 1 radio button, 
		// we have to put the buttons in a group 
		
		ButtonGroup group = new ButtonGroup();
		group.add(hamburgerBtn);
		group.add(pizzaBtn);
		group.add(hotDogBtn);
		
		pizzaBtn.addActionListener(this);
		hamburgerBtn.addActionListener(this);
		hotDogBtn.addActionListener(this);

		// ----------- JFrame ------------

		this.setSize(450, 450);
		this.setTitle("Radio Buttons");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(hamburgerBtn);
		this.add(pizzaBtn);
		this.add(hotDogBtn);

		this.pack(); // the component will fill out the entire screen
		// but to make it work, you need to comment out the setBounds() and
		// setLayout(null)
		// and the add() method must be used BEFORE pack()
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == pizzaBtn) {
			 System.out.println("Pizza was selected!");
		 } else if (e.getSource() == hamburgerBtn) {
			 System.out.println("Hamburger was selected!");
		 } else {
			 System.out.println("Hot dog was selected!");
		 }

	}

}
