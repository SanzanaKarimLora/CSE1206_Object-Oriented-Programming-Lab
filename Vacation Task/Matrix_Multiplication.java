import java.util.Scanner;
public class Matrix_Multiplication {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a1[][] = new int[3][3];
        int a2[][] = new int[3][3];
        int a3[][] = new int[3][3];
        
        System.out.println("Enter the elements of 1st array: ");
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
        System.out.println("Enter the elements of 2nd array: ");
        for(int i = 0; i < a2.length; i++){
            for(int j = 0; j < a2.length; j++){
                a2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < a2.length; i++){
            for(int j = 0; j < a2.length; j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < a3.length; i++){
            for(int j = 0; j < a3.length; j++){
               int s1 = 0;
               for(int k = 0; k < a3.length; k++){
                   s1 = s1 + a1[i][k] * a2[k][j];
                   a3[i][j] = s1;
               }
            }
        }
        System.out.println("The multiplication of two matrixes: ");
        for(int i = 0; i < a3.length; i++){
            for(int j = 0; j < a3.length; j++){
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
