import java.util.HashMap;

public class RomanToInteger {

    public static int integerConvertor(String str) {
        HashMap<Character, Integer> map = new HashMap();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevalue = 0;
        for (int i = str.length() - 1; i > 0; i--) {

            char strchar = str.charAt(i);
            int currentvalue = map.get(strchar);

            if (currentvalue < prevalue) {
                total -= currentvalue;
            } else {
                total += currentvalue;
            }
            prevalue = currentvalue;
        }
        return total;
    }

    public static void main(String[] args) {

        String str = "XXCCMMV";
        System.out.println(integerConvertor(str));
    }
}