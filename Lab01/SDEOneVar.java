import javax.swing.JOptionPane;
public class SDEOneVar {
    public static void main(String[] args) {
        String strNum1, strNum2,strNum3;
        String strNotification = "You've just entered the equation:\n";
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first coefficient: ","Input the first coefficient",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNotification += strNum1 + "*x^2 + ";
        
        strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second coefficient: ","Input the second coefficient",
                JOptionPane.INFORMATION_MESSAGE);
        
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2 + "*x + ";
        strNum3 = JOptionPane.showInputDialog(null, 
                "Please input the third coefficient: ","Input the third coefficient",
                JOptionPane.INFORMATION_MESSAGE);
        double num3 = Double.parseDouble(strNum3);
        strNotification += strNum3 + " = 0 \n";
        
        double delta= num2*num2 - 4*num1*num3;
        if (delta<0){
            strNotification += "The equation has no solution";
        }
        else{
            if (delta==0){
                strNotification += "The equation has double root: x = " + (-num2/2*num1); 
            }
            else{
                strNotification += "The equation has two distinct roots: x1 = " 
                                + ((-num2 + Math.sqrt(delta))/(2*num1)) + " & x2 = " 
                                + ((-num2 - Math.sqrt(delta))/(2*num1));
            }
        }
        JOptionPane.showMessageDialog(null,strNotification,
        "Show equation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }    
}
