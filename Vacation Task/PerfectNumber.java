import java.util.Scanner;
public class PerfectNumber {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0, count = 1, sum = 0;
        
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        
        while(count < n){
            if(n % count == 0)
                sum += count;
            count++;
        }
        if(sum == n)
            System.out.println(n + " is a perfect number.");
        else
            System.out.println(n + " is not a perfect number.");
    }
    
}
 