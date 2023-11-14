package lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change first class ticket ");
		JOptionPane.showMessageDialog(null, "You have been choosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
	}
}
