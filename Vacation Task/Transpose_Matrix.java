import java.util.Scanner;
public class Transpose_Matrix {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int r_n=0, c_n=0;
        
        System.out.println("Enter the number of rows: ");
        r_n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        c_n = sc.nextInt();
        
        int ar[][] = new int[r_n][c_n];
        
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < r_n; i++){
            for(int j = 0; j < c_n; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i = 0; i < r_n; i++){
            for(int j = 0; j < c_n; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        int trans_mat[][] = new int[c_n][r_n];
        
        for(int i = 0; i < r_n; i++){
            for(int j = 0; j < c_n; j++){
                trans_mat[j][i] = ar[i][j];
            }
        }
        
        System.out.println("Transpose matrix of the given matrix: ");
        for(int i = 0; i < c_n; i++){
            for(int j = 0; j < r_n; j++){
                System.out.print(trans_mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
