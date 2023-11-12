package GUISwing;

import java.awt.event.*;
import java.io.File;
import java.awt.*;
import javax.swing.*;

public class FileLoader extends JFrame implements ActionListener {
	
	JButton button;

	public static void main(String[] args) {

		// JFileChooser - a GUI mechanism to choose a file (opens and saves it)
		
		new FileLoader();

	}

	public FileLoader() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		// ----------- JButton ------------
		button = new JButton("Select a File");
		button.addActionListener(this);

		// ----------- JFrame ------------

		this.setTitle("File Loader");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
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
			
			JFileChooser fileChooser = new JFileChooser();
			
			// Set the default directory 
			fileChooser.setCurrentDirectory(new File("./src/GUISwing")); // will open the GUISwing folder
			
			// Selects a file to OPEN (and returns an integer: 0 for "Open", 1 - for "Cancel" or "Exit")
			int responseOpen = fileChooser.showOpenDialog(null); 
			
			if (responseOpen == 0) {
				// or you can write: if (response == JFileChooser.APPROVE_OPTION)
				
				// Get the file absolute path
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file); // /Users/sharinasvetlana/Desktop/CES 2023.docx
			}
			
			// Selects a file to SAVE it (and returns an integer: 0 for "Open", 1 - for "Cancel" or "Exit")
			int responseSave = fileChooser.showSaveDialog(null);
		}

	}

}
