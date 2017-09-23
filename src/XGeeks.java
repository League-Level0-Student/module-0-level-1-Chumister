
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {
		String Arin = "Arin's";
		String Dan = "Dan's";

		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Arin")) {
			JOptionPane.showMessageDialog(null, "Arin's superpower is the Power of nitpicking");
		}
		if (name.equals("Dan")) {
			JOptionPane.showMessageDialog(null, "Dan's superpower is the Power of smashing");
		}
	}

}
