import java.util.*;
public class LargestElements {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int[] array = new int[5];

        for(int i=0 ; i<array.length;i++){
            array[i]=sc.nextInt();
        }
      
        int max = array[0] ;
        
        for(int i=1; i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }

        }

        System.out.println("Largest Element in the array is : "+ max);


    }
}