package lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers{
	public static void main(String[] args) {
		String num1,num2;
		String Noti = "Ban vua nhap ";
		num1 = JOptionPane.showInputDialog(null,"Please input the first number","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null,"Please input the second number","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		Noti += num1 + " va " + num2;
		JOptionPane.showMessageDialog(null, Noti,"Input number",JOptionPane.INFORMATION_MESSAGE);
		System.exit(3);
	}
}