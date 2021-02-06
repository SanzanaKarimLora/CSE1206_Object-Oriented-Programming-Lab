import java.util.Scanner;
public class Matrix_Determinant {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);
        int n=0, deter=0;
        
        System.out.println("Enter the matrix order(2 or 3) : ");
        n = sc.nextInt();
        
        int ar[][] = new int[n][n];
        
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }
        if(n == 2){
            deter = ar[0][0] * ar[1][1] - ar[0][1] * ar[1][0];
        }
        else{
            deter = ar[0][0] * (ar[1][1] * ar[2][2] - ar[1][2] * ar[2][1]) - ar[0][1] * (ar[1][0] * ar[2][2] - ar[1][2] * ar[2][0]) + ar[0][2] * (ar[1][0] * ar[2][1] - ar[1][1] * ar[2][0]);
        }
        System.out.println("The determinant of the matrix is " + deter);
    }
    
}
