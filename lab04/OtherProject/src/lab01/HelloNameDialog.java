package lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Enter your name here ");
		JOptionPane.showMessageDialog(null,"Hi " + result + "!");
		System.exit(3);
	}
}