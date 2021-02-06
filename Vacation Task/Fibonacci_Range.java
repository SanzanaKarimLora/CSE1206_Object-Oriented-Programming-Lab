import java.util.Scanner;
public class Fibonacci_Range {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a = 0, b = 0, first = 0, second = 1;
        
        System.out.println("Enter the lower limit of the range: ");
        a = sc.nextInt();
        System.out.println("Enter the upper limit of the range: ");
        b = sc.nextInt();
        
        while(second < b){
            int term = first + second;
            first = second;
            second = term;
            
            if(term >= a && term <= b)
                System.out.print(term + " ");
        }
        
    }
    
}
