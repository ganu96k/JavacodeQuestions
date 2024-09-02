import java.util.*;
public class AverageOfArray {


    public void averageArray(int[] arr){
        int sum = 0;
        int avgs = 0 ; 
        for(int i =0 ; i<arr.length;i++){
          sum += arr[i];
        }
        avgs = sum/arr.length ;
        System.err.println("Average of Array element is : " + avgs + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = new int[5];
  
        System.out.println("Enter 5 integers separated by spaces:");
        // Read integers from the user
          for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
         }
         AverageOfArray avg = new AverageOfArray();
           avg.averageArray(arr);
    }
    
}
