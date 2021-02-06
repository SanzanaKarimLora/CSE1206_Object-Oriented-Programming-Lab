import java.util.Scanner;
public class Merge_Sort {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        int merge[] = new int[200];
        int x = 0, y = 0;
        int mA = 0 ;
        int mB = 0;
        
        System.out.println("Enter the number of elements of the first array: ");
        x = sc.nextInt();
        System.out.println("Enter the elements of first array : ");
        for(int i = 0; i < x; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The elements of first array : ");
        for(int i = 0; i < x; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter the number of elements of the second array: ");
        y = sc.nextInt();
        System.out.println("Enter the elements of second array : ");
        for(int i = 0; i < y; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("The elements of second array : ");
        for(int i = 0; i < y; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < x + y; i++){
          if((mA < x) && (mB < y)){  
            if(a[mA] < b[mB]){
                merge[i] = a[mA];
                mA++;
            }
            else{
                merge[i] = b[mB];
                mB++;
            }
          }
          else if(mA == x){
              while(i < x + y){
                  merge[i] = b[mB];
                  mB++;
                  i++;
              }
          }
          else{
              while(i < x + y){
                  merge[i] = a[mA];
                  mA++; 
                  i++;
              }
          }
        }
        System.out.println("The sorted array : ");
        for(int i = 0; i < x + y; i++){
           System.out.print(merge[i] + " "); 
        }
    }
    
}
