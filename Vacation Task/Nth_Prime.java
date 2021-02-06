import java.util.Scanner;
public class Nth_Prime {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n=0, count=0;
        
        System.out.println("Enter the term which you want to know: ");
        n = sc.nextInt();
        
        for(int i = 2; i <= 10000000; i++){
            int flag = 0;
            for(int j = 2; j <= i/2; j++){
               if(i % j == 0){
                   flag =1;
                   break;
               } 
            }
            if(flag == 0)
                count++;
            if(count == n){
                System.out.println(n + "th prime number is " + i);
                break;
            }
        }
    }
    
}
