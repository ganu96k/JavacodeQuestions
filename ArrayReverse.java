import java.util.Scanner;

public class ArrayReverse {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements To array: ");
    int [] arr = new int[5];
    for(int i = 0 ; i< arr.length;i++){
        arr[i]=sc.nextInt();
    }
      int [] arr1 =new int[arr.length];
    
//for(int i =arr.length-1 , int j=0 ; i>=0 , j<arr1.length ;i--,j++)
     for (int i = arr.length - 1, j = 0; i >= 0 && j < arr1.length; i--, j++){
        arr1[j] = arr[i];
    }

    System.out.println("Reverse array is : ");
    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
    }
}

    
}
