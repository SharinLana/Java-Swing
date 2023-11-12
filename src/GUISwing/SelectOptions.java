package GUISwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SelectOptions extends JFrame implements ActionListener {
	
	JComboBox box;

	public static void main(String[] args) {

		// JComboBox - a GUI component that combines a button or editable field
		// and a drop-down list

		new SelectOptions();

	}

	public SelectOptions() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		// ----------- JComboBox ------------
		
		// YOU MUST USE REFERENCE CLASSES TO STORE THE VALUES INTO A COMBO BOX,
		// NOT THE PRIMITIVE TYPES!
		String[] animals = {"dog", "cat", "mouse"}; // or Integer, Double, Float, Character (not int, double, float, char)
		
		box = new JComboBox(animals);
		box.setSelectedIndex(0);
		box.addActionListener(this);
		
//		box.setEditable(true); // to be able to write in the field
//		System.out.println(box.getItemCount());
//		box.addItem("horse");
//		box.insertItemAt("pig", 0);
//		box.removeItem("dog");
//		box.removeItemAt(1);
//		box.removeAllItems();
		
		

		// ----------- JFrame ------------

		this.setSize(450, 450);
		this.setTitle("Combo Box");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		this.add(box);

		this.pack(); // the component will fill out the entire screen
		// but to make it work, you need to comment out the setBounds() and
		// setLayout(null)
		// and the add() method must be used BEFORE pack()
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			System.out.println(box.getSelectedItem());
			System.out.println(box.getSelectedIndex());
		}
	}

}
