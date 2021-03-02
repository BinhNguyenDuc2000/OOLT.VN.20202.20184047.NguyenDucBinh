import javax.swing.JOptionPane;
public class FDETwoVar {
    public static void main(String[] args) {
        String strNum11, strNum12, strNum21 ,strNum22,strNum13,strNum23;
        String strNotification = "You've just entered the equation:\n";
        strNum11 = JOptionPane.showInputDialog(null,
        "Please input the coefficient a11: ","Input the coefficient a11",
        JOptionPane.INFORMATION_MESSAGE);
        double num11 = Double.parseDouble(strNum11);
        strNotification += strNum11 + "*x1 + ";

        strNum12 = JOptionPane.showInputDialog(null,
        "Please input the coefficient a12: ","Input the coefficient a12",
        JOptionPane.INFORMATION_MESSAGE);
        double num12  = Double.parseDouble(strNum12);
        strNotification += strNum12 + "*x2 = ";
        
        strNum13 = JOptionPane.showInputDialog(null,
        "Please input the coefficient b1: ","Input the coefficient b1",
        JOptionPane.INFORMATION_MESSAGE);
        double num13 = Double.parseDouble(strNum13);
        strNotification += strNum13 + "\n";
        
        strNum21 = JOptionPane.showInputDialog(null,
        "Please input the coefficient a21: ","Input the coefficient a21",
        JOptionPane.INFORMATION_MESSAGE);
        double num21 = Double.parseDouble(strNum21);
        strNotification += strNum21 + "*x1 + ";      

        strNum22 = JOptionPane.showInputDialog(null,
        "Please input the coefficient a22: ","Input the coefficient a22",
        JOptionPane.INFORMATION_MESSAGE);
        double num22 = Double.parseDouble(strNum22);
        strNotification += strNum22 + "*x2 = ";

        strNum23 = JOptionPane.showInputDialog(null,
        "Please input the coefficient b2: ","Input the coefficient b2",
        JOptionPane.INFORMATION_MESSAGE);
        double num23 = Double.parseDouble(strNum23);
        strNotification += strNum23 +"\n";
        if (num11*num22!=num12*num21){
            strNotification += "The equation has a unique solution: (x1,x2) = (" 
            + ((num13*num22-num23*num12)/(num11*num22-num12*num21)) + "," + 
            ((num11*num23-num21*num13)/(num11*num22-num21*num12)) + ")";
        }
        else {
            if ((num13*num22-num23*num12)==0 && (num11*num23-num21*num13)==0){
                strNotification += "The equation has infinitely many solutions";
            }
            else{
                strNotification += "The equation has no solution";
            }

        }
        JOptionPane.showMessageDialog(null,strNotification,
        "Show equation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }    
}

