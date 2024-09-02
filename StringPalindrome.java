import java.util.*;
public class StringPalindrome {

    public static  boolean stringisPalindrome(String str){
        for(int i = 0 ; i<=str.length()/2;i++){
             if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
             }
            
        }
        return true;
    } 

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        boolean palindrome = StringPalindrome.stringisPalindrome(str);

        if(palindrome){
            System.out.println("String is palindrome: ");
        }
        else{
            System.out.println("String is not  palindrome: ");
        }
    }
    
}
