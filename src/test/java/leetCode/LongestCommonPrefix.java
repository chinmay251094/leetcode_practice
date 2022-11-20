package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"komal", "komolika", "komali"};
        System.out.println("Returned value: " + new LongestCommonPrefix().longestCommonPrefix(str));
    }

//    public String longestCommonPrefix(String[] strs) {
//        int len = strs.length;
//
//        if (len <= 1 || len > 200) {
//            return "";
//        }
//
//        String prefix = strs[0];
//        for (int i = 0; i < len; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
//        }
//        return prefix;
//    }

    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";

        if (strs == null || strs.length == 0) {
            return longestCommonPrefix;
        }

        int index = 0;
        //{"komal", "komolika", "komali"}
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index > strs[i].length() || c != strs[i].charAt(index)) {
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix = longestCommonPrefix + c;
            index++;
        }
        return longestCommonPrefix;
    }
}

