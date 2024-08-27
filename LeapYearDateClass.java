import java.beans.SimpleBeanInfo;
import java.text.SimpleDateFormat;
import java.util.*;
public class LeapYearDateClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date :");
        try{

        String date = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Date dateToConvert = sdf.parse(date);

        SimpleDateFormat yearFormate = new SimpleDateFormat("yyyy");

        int year = Integer.parseInt(yearFormate.format(dateToConvert));
       
        if((year%4==0 && year % 100 !=0 )||year % 400 ==0){
            System.out.println("Leap Year"+date);
        }
        else{
            System.out.println("not leap year :"+ date);
        }
    }catch(Exception e){
       System.out.println("invalid date formate:");
    }

    }
}
