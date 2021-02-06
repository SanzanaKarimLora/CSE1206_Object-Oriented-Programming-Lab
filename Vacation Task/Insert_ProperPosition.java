import java.util.Scanner;
public class Insert_ProperPosition {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int a1[] = new int[100];
        int n = 0, i = 0, x = 0;
        
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();
        
        System.out.println("Enter the elements in ascending order : ");
        for(i = 0; i < n; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("The elements of this array in ascending order : ");
        for(i = 0; i < n; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter the number which you want to insert : ");
        x = sc.nextInt();
        
        i = n-1;
        while(x < a1[i] && i >= 0){
            a1[i+1] = a1[i];
            i--;
        }
        a1[i+1] = x;
        n++;
        
        System.out.println("New array after inserting number in proper position : ");
        for (i = 0; i < n; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter the elements in descending order : ");
        for(i = 0; i < n; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("The elements of this array in descending order : ");
        for(i = 0; i < n; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter the number which you want to insert : ");
        x = sc.nextInt();
        
        i = n-1;
        while(x > a1[i] && i >= 0){
            a1[i+1] = a1[i];
            i--;
        }
        a1[i+1] = x;
        n++;
        
        System.out.println("New array after inserting number in proper position : ");
        for (i = 0; i < n; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        
    }
    
}
