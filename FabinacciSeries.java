import java.util.*;
public class FabinacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int firstNum = 0 ;
        int secondNum = 1 ;
        int newNum ; 
         System.out.print(firstNum+ " "+ secondNum+" ");
        for(int i = 0 ; i< num ;i++){
            newNum = firstNum + secondNum ;
            firstNum = secondNum;
            secondNum= newNum; 
            System.err.print(newNum+" "); 
        }
       
         
    }
    
}
