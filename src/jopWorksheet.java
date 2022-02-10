//Yoav Amit
//Period 1
//October 14, 2021


import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class jopWorksheet
{
	public static void changeJOP()
	{
		// copy and paste the code with your new colors and fonts here:
		// These colors are very ugly - you need to CHANGE them!

		// The font of the message text
		UIManager.put("Label.font", new FontUIResource (new Font("Tempus Sans ITC", Font.BOLD, 58)));
		// The color of the message text
		UIManager.put("OptionPane.messageForeground",new Color(0,0,0));

		// color for text field (where you are inputting data)
		UIManager.put("TextField.background", Color.white);
		// font for message in text field
		UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
		// color for message in text field
		UIManager.put("TextField.foreground", Color.black);

		// The color of the panel 
		UIManager.put("Panel.background",new Color(102, 204, 255));
		// The color around the outside of the panel
		UIManager.put("OptionPane.background",new Color(0, 51, 102));

		// Buttons at bottom
		UIManager.put("Button.background",new Color(132,112,255));
		UIManager.put("Button.foreground", new Color(72,61,139));
		UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
		
	}
	public static void main(String[] args) {
		changeJOP();
		String answer = "";
		
		// Ask for the users first name and store it in a String variable:
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		// Ask for the users middle initial and store it in a char variable:
		String middleName = JOptionPane.showInputDialog("Enter your middle innitial: ");
		// Ask for the users last name and store it in a String variable:
		String lastName = JOptionPane.showInputDialog("Enter your last name: ");
		// Add all 3 variables to your answer String in the form:
		//	Your name is Hadley P. Steelman.
		answer +="Your full name is "+name+" "+middleName+". "+lastName+". \n";	

		
		
		// Ask for the users lucky number and store it in an int variable:
		int luckyNum = Integer.parseInt(JOptionPane.showInputDialog("Enter your lucky number:"));	
		
		// Ask for the users favorite color and store it in a String variable:
		String favColor = JOptionPane.showInputDialog("Enter your favorite color: ");

		
		// Add both variables to your answer String in the form:
		//  Your lucky number is 13 and your favorite color is yellow!
		answer +="Your lucky number is "+luckyNum+"" + " and your favorite color is "+favColor+"." ;	
		
		// Print your answer variable in a JOP window:
		JOptionPane.showMessageDialog(null, answer);
	}
}