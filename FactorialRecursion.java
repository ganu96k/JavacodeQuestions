import java.util.*;
public class FactorialRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num =sc.nextInt();
        
        System.out.println("Factorial of number :  " + num +" is  " + " " + factorial(num));


    }

    public static int factorial(int num){
        if(num==0 || num==1 ){
            return 1;
        }
        return num * factorial(num-1);


    }
}
