import java.util.Scanner;
public class LCM_3Numbers {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n1=0, n2=0, n3=0;
        
        System.out.println("Enter the 1st number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        n2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        n3 = sc.nextInt();
        
        if((n1%2==0 && n2%2==0 && n3%2==0) || (n1%2==0 && n2%2==0) || (n2%2==0 && n3%2==0) || (n1%2==0 && n3%2==0)){
            
        }
        
    }
    
}
