import java.util.Scanner;
public class PrimeNumber {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a=0, b=0, m=0;
        
        System.out.println("Enter the lower range: ");
        a = sc.nextInt();
        System.out.println("Enter the upper range: ");
        b = sc.nextInt();
        
        System.out.println("Prime numbers between the given range: ");
        while (a < b){
          m = 0;

          for(int i = 2; i <= a/2; ++i){
        
            if(a % i == 0){
            
                m = 1;
                break;
            }
        }

        if (m == 0)
            System.out.print(a + " ");

        ++a;
    }
       
    }
    
}
