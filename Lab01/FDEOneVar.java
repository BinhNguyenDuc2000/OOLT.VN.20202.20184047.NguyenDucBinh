import javax.swing.JOptionPane;
public class FDEOneVar {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered the equation:\n";
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first coefficient: ","Input the first coefficient",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        if (num1==0){
            JOptionPane.showMessageDialog(null,"The first coefficient cannot be 0",
            "Error!", JOptionPane.INFORMATION_MESSAGE);
        
            System.exit(1);
        }

        strNotification += strNum1 + "x + ";
        
        strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second coefficient: ","Input the second coeffiecient",
                JOptionPane.INFORMATION_MESSAGE);
        
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2 + " = 0 \nThe equation has 1 unique solution: x = " + (-num2/num1) ;
        
        JOptionPane.showMessageDialog(null,strNotification,
        "Show equation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }    
}
