import java.util.Scanner ;

public class RotateArray {
      

     // shift array element to left 
       public void rotateArray(int n , int[] arr){
        for(int i = 0 ; i < n ; i++){
               int temp = arr[i];
            for(int j= 0 ; j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
              arr[arr.length-1]=temp ;
        
             
        }
           
    }
        // rotate array element to right 
        public void rotateArrayRight(int n , int[]arr){
            for(int i =0 ; i<n ; i++){
                int temp = arr[arr.length-1];
                for(int j = arr.length-1 ;j > 0 ; j--){
                 arr[j]=arr[j-1];
                }
              arr[i]=temp ; 
            }
        }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   

       int[] arr = new int[5];

      System.out.println("Enter 5 integers separated by spaces:");
      // Read integers from the user
        for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
       }
         System.out.println("Enter Number to rotate Array : ");
         int target = sc.nextInt();
          
        RotateArray ra = new RotateArray();
              for(int num : arr){
                System.out.print(num+ " ,");
              }
              System.out.println();

        // call function to Right array 
        ra.rotateArrayRight(target , arr);

        System.out.println("Array After Right rotating : ");
        for(int num : arr){
            System.out.print(num + " , ");
        }
        System.err.println();
        
        //call functiopn to left  rotate 
        ra.rotateArray(target, arr);
        System.out.println("Array After left rotating : ");
        for(int num : arr){
            System.out.print(num + " , ");
        }
        System.out.println();
    
      sc.close();
    }
}
