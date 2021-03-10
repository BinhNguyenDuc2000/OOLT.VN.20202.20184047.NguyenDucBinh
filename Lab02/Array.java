import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // Thuc hien nhap so phan tu cua mang
        Scanner keyboard = new  Scanner(System.in);
        System.out.println("How many elements are in the Array?");
        int iNumberOfElement=keyboard.nextInt();
        int[] iArray=new int[iNumberOfElement];
        int sum=0;

        // Thuc hien nhap tung phan tu va tinh tong cua mang
        for (int i=0;i<iNumberOfElement;i++){
            System.out.println("What is the value of element " + (i+1) + " ?");
            iArray[i]=keyboard.nextInt();
            sum += iArray[i];
        }

        // In ra tong va gia tri trung binh cua mang
        System.out.println("The sum of the array is: " + sum + 
                            "\nThe average value of the array is: " + sum/iNumberOfElement);   
        
        // Sap xep cac phan tu trong mang theo thu tu tang dan va in ra man hinh
        System.out.println("The sorted array from lowest to highest is:");
        for (int i=0;i<iNumberOfElement-1;i++){
            for (int j=i+1;j<iNumberOfElement;j++){
                if (iArray[i]>iArray[j]){
                    int temp=iArray[i];
                    iArray[i]=iArray[j];
                    iArray[j]=temp;
                }
            }
            System.out.print(iArray[i] + " , ");
        }
        System.out.println(iArray[iNumberOfElement-1]);

        System.exit(0);
    }
    
}
