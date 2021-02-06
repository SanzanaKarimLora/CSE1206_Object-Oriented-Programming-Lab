import java.util.Scanner;
public class FibonacciOrNot {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0;
        
        System.out.println("Enter an integer: ");
        n  = sc.nextInt();
        
        if((n == 0) || (n == 1)){
            System.out.println(n + " is a Fibonacci number.");
        }
        else{
            int first = 0;
            int second = 1;
            int term = first + second;
            
            while(term < n){
                first = second;
                second = term;
                term = first + second;
            }
            if(term == n){
                System.out.println(n + " is a Fibonacci number.");
            }
            else{
                System.out.println(n + " is not a Fibonacci number.");
            }
        }
    }
}
