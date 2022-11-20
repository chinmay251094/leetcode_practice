package leetCode;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int len = mostWordsFound(sentences);
        System.out.println(len);
    }

//    public static int mostWordsFound(String[] sentences) {
//        int maxWord = 0;
//
//        if (!(sentences.length < 0)) {
//            for (int i = 0; i < sentences.length; i++) {
//                for (int j = 0; j < sentences[i].length(); j++) {
//                    if (sentences[i].charAt(i) == ' ') {
//                        maxWord++;
//                    }
//                }
//            }
//        }
//        return maxWord;
//    }

//    public static int mostWordsFound(String[] sentences) {
//        int max = 0;
//        for (String s : sentences) {
//            int x = s.indexOf(" "), count = 1;
//            while (x != -1) {
//                count++;
//                x = s.indexOf(" ", x + 1);
//            }
//            max = Math.max(count, max);
//        }
//        return max;
//    }

//    public static int mostWordsFound(String[] sentences) {
//        int max = 1;
//        for (int i = 0; i < sentences.length; i++) {
//            String[] arr = sentences[i].split(" ");
//            max = Math.max(max, arr.length);
//        }
//        return max;
//    }

    public static int mostWordsFound(String[] sentences) {
        int max = -1;
        for (int i = 0; i < sentences.length; i++) {
            String arr[] = sentences[i].split(" ");
            if (arr.length > max)
                max = arr.length;
        }
        return max;
    }
}
