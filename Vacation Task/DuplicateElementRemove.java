import java.util.Scanner;
public class DuplicateElementRemove {
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0, duplicate = 0;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int ar[] = new int[100];
        System.out.println("Enter the integers: ");
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        
        System.out.println("The elements of the array is :  ");
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(ar[j] == ar[i])
                    System.out.println("Duplicate element is: " + ar[i]);
                break;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(ar[i] == ar[j]){
                    duplicate++;
                    break;
                }
            }
        }
        System.out.println("Total duplicate elements of the array is " + duplicate);
        System.out.println("Array after removing duplicate elements: ");
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; ){
                if(ar[j] == ar[i]){
                    for(int k = j; k < n; k++){
                        ar[k] = ar[k+1];
                    }
                    n--;
                }
                else
                    j++;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(ar[i] + " ");
        }
    }
    
}
