package lab01;
import javax.swing.JOptionPane;
public class CalculateNumber{
	public static void main(String[] args) {
		String strNum1,strNum2;
		String sum, difference, product, quotient;
		String notification;
		strNum1 = JOptionPane
				.showInputDialog(null,"Please input the first number","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane
				.showInputDialog(null,"Please input the second number","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		sum = Double.toString(num1+num2);
		difference = Double.toString(num1-num2);
		product = Double.toString(num1*num2);
		if(num2!= 0){
			quotient = Double.toString(num1/num2);
		}else{
			quotient = "null";
		}
		notification = "Tong la " + sum + "\n Hieu la " + difference + "\n Tich la " + product + "\n Thuong la " + quotient;
		JOptionPane.showMessageDialog(null, notification,"Calculate number",JOptionPane.INFORMATION_MESSAGE);
		System.exit(3);
	}
}