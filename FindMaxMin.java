import  java.util.*;
public class FindMaxMin {

    public void maxElement(int[] arr ){
       int max = arr[0];
       if(arr.length<1 || arr.length==1){
        return ;
       }
       for(int i = 0 ; i<arr.length;i++){
        if(arr[i]>max){
         max = arr[i]; 
        }
       }
       System.out.println("Max Element of array is : "+ max );
    }

    public void minElement(int [] arr ){
        int max = arr[0];
        if(arr.length<1 || arr.length==1){
         return ;
        }
      int min = arr[0];
      for(int i = 0 ; i<arr.length;i++){
        if(arr[i]<min){
         min = arr[i];
        }
       }
       System.out.println("Max Element of array is : "+ min );
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = new int[5];
  
        System.out.println("Enter 5 integers separated by spaces:");
        // Read integers from the user
          for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();

         }

         FindMaxMin fm = new FindMaxMin();
         fm.maxElement(arr);
    }

    
}
