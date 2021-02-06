import java.util.Scanner;
public class GCD_nNumbers {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n=0, gcd=0;
        
        System.out.println("Enter the total number to find GCD : ");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the numbers which you want to find GCD : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers which you entered : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < arr.length; i++){
            gcd = getGCD(gcd, arr[i]);
            gcd = gcd;
        }
        System.out.println("GCD of entered numbers : " + gcd);
        
    }
    public static int getGCD(int x, int y){
        if(x == 0) return y;
        else return getGCD(y % x ,x);
    }
    
}
