
// Ask the user what height they are. 
// If they are over 4ft, tell them they can go on the rollercoaster. 
// If they are under 4ft, tell them they need to grow more first.		
import javax.swing.JOptionPane;

public class RollerCoaster {
	System.out.println(height);
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog(null, "What is your height");
		int h = Integer.parseInt(height);
		if (h < 4) {
			JOptionPane.showConfirmDialog(null, "Too short");
		} else

		{
			JOptionPane.showMessageDialog(null, "Go right ahead");
		}
	}

}
