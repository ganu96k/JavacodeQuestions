import java.util.*;

public class reverseArrayRecursion {

    public static void recursion(int[] arr , int left , int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        recursion(arr, left + 1 , right - 1);
    }

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
       // ReverseArrayRecursion r = new ReverseArrayRecursion();
        reverseArrayRecursion r = new reverseArrayRecursion();
        int[] arr = new int[5];

        System.out.println("Enter 5 integers separated by spaces:");
        // Read integers from the user
          for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
         }

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");

        }

        recursion(arr , 0 , arr.length-1);




        System.out.println("Original array after reverse :");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
