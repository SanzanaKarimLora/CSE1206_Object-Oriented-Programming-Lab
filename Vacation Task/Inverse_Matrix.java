import java.util.Scanner;
public class Inverse_Matrix {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a1[][] = new int[3][3];
        int a2[][] = new int[3][3];
        
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a1.length; j++){
                a1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a1.length; j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
