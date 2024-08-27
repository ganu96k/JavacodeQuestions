public class SumOfDigitOfNUmber {
    public static void main(String[] aregs){
        int num = 154785;
     
        int digit = 0;
        int sum =0;
        while(num!=0){
            digit = num%10;
            sum += digit;
            num/=10;

        }

        System.out.println(sum);
    }
    
}
