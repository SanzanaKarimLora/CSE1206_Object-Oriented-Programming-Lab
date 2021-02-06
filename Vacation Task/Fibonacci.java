import java.util.Scanner;
public class Fibonacci {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        
        int count = 1, n = 0, first = 0, second = 1, term = 0;
        
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        
        while(count <= n){
            System.out.print(first + " ");
            term = first + second;
            first = second;
            second = term;
            count++;
        }
    }
    
}
