package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {

	JMenuBar menuBar;
	JMenu fileMenu, editMenu, helpMenu;
	JMenuItem loadItem, saveItem, exitItem;
	ImageIcon fileIcon, saveIcon, exitIcon;

	public static void main(String[] args) {
		new MenuBar();
	}

	public MenuBar() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the this is set to null)
		// you have to use setBounds() for the components
		
		// --------- ImageIcons -----------
		fileIcon = new ImageIcon("folder.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");

		// --------- JMenuBar -----------

		menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(500, 40));

		// --------- JMenus (sub-components of the JMenuBar) -----------

		fileMenu = new JMenu("File"); // sub-components of the menuBar
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");

		// Mnemonics (keyboard shortcuts) for the menus
		fileMenu.setMnemonic(KeyEvent.VK_F); // Ctrl + Alt + F (capital F) stands for "load"
		editMenu.setMnemonic(KeyEvent.VK_E); // Ctrl + Alt + E (capital E) stands for "save"
		helpMenu.setMnemonic(KeyEvent.VK_H); // Ctrl + Alt + H (capital H) stands for "exit"

		// --------- JMenuItem (sub-components of the fileMenu) -----------

		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// Add Icons to the menu items
		loadItem.setIcon(fileIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		// Add action listener to the menu items
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		// Mnemonics (keyboard shortcuts) for the menu items
		loadItem.setMnemonic(KeyEvent.VK_L); // just L (capital L) stands for "load"
		saveItem.setMnemonic(KeyEvent.VK_S); // just S (capital S) stands for "save"
		exitItem.setMnemonic(KeyEvent.VK_E); // just E (capital E) stands for "exit"

		// Add menu items to the fileMenu
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		// Add menus to the menuBar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		// --------- JFrame -----------

		this.setSize(500, 500);
		this.setTitle("Menu Bar");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		this.add(menuBar);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			System.out.println("Loading a file");
		} else if (e.getSource() == saveItem) {
			System.out.println("Saving a file");
		} else {
			System.exit(0);
		}
	}

}
