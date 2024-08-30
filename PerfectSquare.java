
import java.util.*;
import java.util.Scanner;

public class PerfectSquare {

    public static int perfectsqure(int num ){

        int number = (int)Math.sqrt(num);

        int lower = number *number ;
        int upper =(number+1) * (number+1);

        int lowerdiff =num - lower;
        int upperdiff = upper-num ;


        if(lowerdiff < upperdiff){
            return lower ;
        }
        else{
            return upper;
        }
    

    }

    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter NUmber : ");
      int number = sc.nextInt();

       int squr = perfectsqure(number);
       System.err.println("perfect squre of "+ number + " is "+ squr);
    }
    
}
