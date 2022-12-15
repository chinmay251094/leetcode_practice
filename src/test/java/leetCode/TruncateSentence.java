package leetCode;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String sentence = "What is the solution to this problem";
        truncateSentence(sentence, 4);
    }

//    private static String truncateSentence(String s, int k) {
//        String[] words = s.split("\\s");
//        String[] answer = new String[k];
//
//        for (int index = 0; index < k; index++) {
//            answer[index] = words[index];
//        }
//
//        String sentence = answer.toString();
//        System.out.println(sentence);
//        return null;
//    }

    private static String truncateSentence(String s, int k) {
        String[] words = s.split("\\s");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < k; i++) {
            sb.append(words[i]+" ");
        }
        String str = sb.toString();

        return str.trim();
    }
}
