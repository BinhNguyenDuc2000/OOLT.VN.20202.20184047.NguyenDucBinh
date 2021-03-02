import javax.swing.JOptionPane;
public class MathWithDouble {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strSum = "The Sum of two numbers is: ";
        String strDif = "The Difference of two numbers is: ";
        String strPro = "The Product of two numbers is: ";
        String strQuo = "The Quo of two numbers is: ";
        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        
        strSum += strNum1 + " + ";
        strDif += strNum1 + " - ";
        strPro += strNum1 + " * ";
        strQuo += strNum1 + " / ";

        strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        strSum += strNum2 + " = " + (num1 + num2) + "\n";
        strDif += strNum2 + " = " + (num1 - num2) + "\n";
        strPro += strNum2 + " = " + (num1 * num2) + "\n";
        strQuo += strNum2 + " = " + (num1 / num2) + "\n";
        
        JOptionPane.showMessageDialog(null,strSum + strDif + strPro +strQuo,
        "Show results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
