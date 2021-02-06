import java.util.Scanner;
public class Insert_Element {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0, p = 0, e=0;
        
        int arr[] = new int[100];
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("The elements of this array: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        
        System.out.println("Enter the position in which you want to insert element: ");
        p = sc.nextInt();
        
        System.out.println("Enter the element which you want to insert: ");
        e = sc.nextInt();
        
        for(int i = n+1; i > p; i--){
            arr[i] = arr[i-1];
        }
        arr[p] = e;
        
        System.out.println("The new array after inserting element: ");
        for(int i = 0; i < n+1; i++)
            System.out.print(arr[i] + " ");
    }
    
}
