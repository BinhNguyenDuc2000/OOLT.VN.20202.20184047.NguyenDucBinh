import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        // Thuc hien nhap kich thuoc cua ma tran
        Scanner keyboard = new  Scanner(System.in);
        System.out.println("How many row are in the Matrixes?");
        int iRow=keyboard.nextInt();
        System.out.println("How many column are in the Matrixes?");
        int iColumn=keyboard.nextInt();

        // Thuc hien nhap vao ma tran dau tien
        int[][] iMatrix1 = new int[iRow][iColumn];
        for (int i=0;i<iRow;i++){
            for (int j=0;j<iColumn;j++){
                System.out.println("What is the value of element [" + (i+1) +
                                    "][" + (j+1) +"] of the first matrix?");
                iMatrix1[i][j]=keyboard.nextInt();
            }
        }
        
        // Thuc hien nhap vao ma tran thu hai
        int[][] iMatrix2 = new int[iRow][iColumn];
        for (int i=0;i<iRow;i++){
            for (int j=0;j<iColumn;j++){
                System.out.println("What is the value of element [" + (i+1) +
                                    "][" + (j+1) +"] of the second matrix?");
                iMatrix2[i][j]=keyboard.nextInt();
            }
        }

        // Thuc hien cong vao hai ma tran va in ket qua ra man hinh
        for (int i=0;i<iRow;i++){
            for (int j=0;j<iColumn;j++){
                System.out.println("The value of element [" + (i+1) +
                                    "][" + (j+1) +"] of sum matrix is " 
                                    + (iMatrix1[i][j] + iMatrix2[i][j] ));
            }
        }

        System.exit(0);
    }
}
