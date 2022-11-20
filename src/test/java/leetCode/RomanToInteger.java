package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMIV"));
    }

    public int romanToInt(String s) {
        if (s.length() < 1 && s.length() > 15) {
            return -1;
        }

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int k = 0;
        //len = 5
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i != len - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                k = k + roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            } else {
                k = k + roman.get(s.charAt(i));
            }
        }
        return k;
    }
}
