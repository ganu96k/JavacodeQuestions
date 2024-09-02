import java.util.*;
public class ArrayReverse {


    public void reverseArray(int[] arr){
        int left = 0 ; 
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        ArrayReverse r = new ArrayReverse();

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

        r.reverseArray(arr);
         
        System.out.println("Original array after Swapping :");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    
}
