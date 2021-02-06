import java.util.Scanner;
public class Bubble_Sort {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0;
        
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        
        int ar[] = new int[n];
        
        System.out.println("Enter the integers: ");
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }
        for(int i = ar.length-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
              if(ar[j] > ar[j+1]){
                  int x = ar[j+1];
                  ar[j+1] = ar[j];
                  ar[j] = x;
              }  
            }
        }
        System.out.println("The sorted array in ascending order: ");
        for(int i = 0; i < ar.length; i++)
               System.out.print(ar[i] + " ");
        
        for(int i = ar.length-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
              if(ar[j] < ar[j+1]){
                  int x = ar[j+1];
                  ar[j+1] = ar[j];
                  ar[j] = x;
              }  
            }
        }
        System.out.println("The sorted array in descending order: ");
        for(int i = 0; i < ar.length; i++)
               System.out.print(ar[i] + " ");
        
    }
    
}
