import java.util.Scanner;
public class Fibonacci_Nth {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int first = 0, second = 1, term = 0, n =0;
        
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        
        for(int i = 1; i < n; i++){
            first = second;
            second = term;
            term = first + second;
        }
        System.out.println("The " + n + " th term of Fibonacci series is " + term);
    }
    
}
