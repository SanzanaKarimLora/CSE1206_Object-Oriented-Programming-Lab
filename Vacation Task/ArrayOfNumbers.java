
import java.util.Scanner;
public class ArrayOfNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);
        int n = 0, sum = 0, avg = 0, sub = 0, count = 0, mx_Val = 0, mx_Count = 0;
        double std_dev = 0, standardDeviation = 0, median = 0; 
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
        }
        avg = sum / n;
        System.out.println("Average of the numbers: " + avg);
        
        int max = arr[0], min=arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum of the numbers: " + max);
        System.out.println("Minimum of the numbers: " + min);
        
        for(int i = 0; i< arr.length; i++){
            sub = arr[i] - avg;
            std_dev = Math.pow(sub, 2);
            standardDeviation = Math.sqrt(std_dev/n);
        }
        System.out.println("The standard deviation is : " + standardDeviation);
        
        for(int i = arr.length-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                  int x = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = x;
              }
            }
        }
        System.out.println("The sorted array in ascending order: ");
        for(int i = 0; i < arr.length; i++)
               System.out.print(arr[i] + " ");
        
        if(n % 2 == 0){
             median = (arr[(n-1)/2] + arr[(n-1)/2+1])/2.0;
        }
        else{
            median = arr[(n + 1 - 1) / 2];
        }
        System.out.println("Median is " + median);
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    ++count;
                }
            }
            if(count > mx_Count){
                mx_Count = count;
                mx_Val = arr[i];
            }
        }
        System.out.println("Mode value is " + mx_Val);
    }
    
}
