//Yoav Amit
//Period 1
//October 14, 2021


import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Test2
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
		//String s1 = JOptionPane.showInputDialog("Enter a double number: ");
		double s2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your lucky number:"));
		//answer +="Your string is: "+s1+ ". \n";	
		//answer +="The length of your string is: "+(s1.length())+ ". \n";
		//answer +="The first letter of your string is: "+(s1.charAt(0));	
		answer +="The sqaure root of "+s2+" = "+(Math.sqrt(s2));
		
		
		// Print your answer variable in a JOP window:
		JOptionPane.showMessageDialog(null, answer);
	}
}