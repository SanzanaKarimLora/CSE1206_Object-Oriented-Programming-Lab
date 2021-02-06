import java.util.Scanner;
public class First_NPerfectNumber {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0, sum = 0;
        
        System.out.println("Enter the number of terms : ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
        }
    }
    
}
