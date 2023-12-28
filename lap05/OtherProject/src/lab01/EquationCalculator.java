package lab01;
import javax.swing.JOptionPane;
public class EquationCalculator{
	public static void LinearEquationSolve() {
		String strNum1,strNum2;
		String notification;
		String x;
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second number","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		if(num1 == 0) {
			return;
		}else {
			x = Double.toString(-num2/num1);
		}
		notification = "X = " + x;
		JOptionPane.showMessageDialog(null, notification,"Calculate",JOptionPane.INFORMATION_MESSAGE);
		System.exit(3);
	}
	
	public static void LinearSystemSolve() {
		String strNum;
		double[] coefficient = new double[6];
		for(int i =0;i<coefficient.length;i++ ) {
			strNum = JOptionPane.showInputDialog(null,"Please input the " + i + " number","Input the" + i + " number",JOptionPane.INFORMATION_MESSAGE);
			coefficient[i] = Double.parseDouble(strNum);	
		}
		double D = coefficient[0] * coefficient[4] - coefficient[1] * coefficient[3];
		double Dx = coefficient[2] * coefficient[4] - coefficient[1] * coefficient[5];
		double Dy = coefficient[0] * coefficient[5] - coefficient[3] * coefficient[2];
		if(D == 0) {
			JOptionPane.showMessageDialog(null, "He vo nghiem hoac vo so nghiem");
		} else {
			JOptionPane.showMessageDialog(null, "X = " + Double.toString(Dx/D) + "\n Y = " + Double.toString(Dy/D) );
		}
	}
	public static void SecondDegreeEquation() {
		String strA, strB, strC;
		strA = JOptionPane.showInputDialog(null,"Please input a ","a*x^2 + bx + c",JOptionPane.INFORMATION_MESSAGE);
		strB = JOptionPane.showInputDialog(null,"Please input b ","a*x^2 + bx + c",JOptionPane.INFORMATION_MESSAGE);		
		strC = JOptionPane.showInputDialog(null,"Please input c ","a*x^2 + bx + c",JOptionPane.INFORMATION_MESSAGE);		
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		double c = Double.parseDouble(strC);
		double D = b*b - 4*a*c;
		if(D < 0) {
			JOptionPane.showMessageDialog(null, "Vo nghiem");
		} else if (D==0) {
			JOptionPane.showMessageDialog(null, "Nghiem duy nhat = " + (-b+Math.sqrt(D))/(2*a));	
		} else {
			JOptionPane.showMessageDialog(null, "Nghiem x1 = " + (-b+Math.sqrt(D))/(2*a) + "\n Nghiem x2 = " + (-b-Math.sqrt(D))/(2*a));	
		}
	}
	public static void main(String[] args) {
//		LinearSystemSolve();
		SecondDegreeEquation();
	}
}