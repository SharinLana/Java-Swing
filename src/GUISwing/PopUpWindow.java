package GUISwing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopUpWindow extends JFrame {

	public static void main(String[] args) {
		
		// JOptionPane - pop up a standard dialog box that prompts users for a value
		//				 or inform them of something.
		
		new PopUpWindow();

	}
	
	public PopUpWindow() {
		
		// ---------- JOptionPane ----------
		
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE); // parent component, message, title, messageType
		JOptionPane.showMessageDialog(null, "This is more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Warning! Your computer has a virus!", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Error! Call tech support now!", "Title", JOptionPane.ERROR_MESSAGE);
		
		int answer = JOptionPane.showConfirmDialog(null, "sis, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		// "Yes" = 0, "No" = 1, "Cancel" = 2, "x" button = -1
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello " + name);
		
		String[] responses = {"No, you're awesome!", "Thank you!", "Blush*"};
		ImageIcon icon = new ImageIcon("thumbsup.png");
		JOptionPane.showOptionDialog(
				null, // parentComponent
				"You are awesome!", // message
				"Secret message", // title
				JOptionPane.YES_NO_CANCEL_OPTION, // optionType
				JOptionPane.INFORMATION_MESSAGE, // messageType
				icon, // icon
				responses, // options
				0 // initialValue
		); 
		
	}

}
