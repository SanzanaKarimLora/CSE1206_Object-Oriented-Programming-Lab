import java.util.Scanner;
public class GCD_3numbers {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n1=0, n2=0, n3=0;
        
        System.out.println("Enter the 1st number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        n2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        n3 = sc.nextInt();
        
        int gcd = getGCD(getGCD(n1, n2), n3);
        System.out.println("GCD of 3 numbers : " + gcd);
    }
    public static int getGCD(int x, int y){
        if(x==0) return y;
        else return getGCD(y%x,x);
    }
}
