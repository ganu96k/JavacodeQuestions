import java.util.*;
public class ReplaceASubStringToSting {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A String : ");
        String str = sc.nextLine();

        System.out.println("Enter olde String to be replace  : ");
        String oldSubString = sc.nextLine();
     
        System.out.println("Enter new String to be replace  : ");
        String newSubString = sc.nextLine();

        String newReplace = str.replace(oldSubString,newSubString);
        System.out.println("New Updated String is : " + newReplace);



    }
    
}
