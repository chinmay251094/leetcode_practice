package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingSentence {
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        sortSentence(sentence);
    }

//        for (int index = 0; index < words.length; index++) {
//            word = words[index];
//            if (index == 0) {
//                min = Integer.parseInt(word.substring(word.length() - 1));
//            }
//            if (Integer.parseInt(word.substring(word.length() - 1)) < min) {
//                min = Integer.parseInt(word.substring(word.length() - 1));
//            }
//        }
//        System.out.print(min + "\n");

    private static String sortSentence(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();
        String item = null;

        for (String word : words) {
            item = word.substring(word.length() - 1) + word;
            list.add(item.substring(0, word.length()));
        }
        Collections.sort(list);

        String ans = null;
        for (int index = 0; index < list.size(); index++) {
            if (index == 0) {
                ans = list.get(index).substring(1);
            } else {
                ans = ans +" "+ list.get(index).substring(1);
            }
        }
        return ans;
    }
}
