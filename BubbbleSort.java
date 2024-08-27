import java.util.Scanner;

public class BubbbleSort {

    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements to sort :");
        int [] array = new int[4];
        
        for(int i =0; i< array.length;i++){
            array[i]=sc.nextInt();
        }

        for(int i = 0 ; i<array.length -1;i++){
            for(int j=0 ; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array [j];
                    array[j]=array[j+1];
                    array[j+1]=temp ;
                }
            }
        }

        System.out.println(" Soreted elemens are :");
        for(int num :array ){
            System.out.print(num+" ");
        }





    }
    
}