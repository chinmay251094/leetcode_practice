package DataFiles;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] arr1 = {"Java", "Python", "PHP"};
        String[] arr2 = {"Ruby", "C#", "Java", "Python"};
        findMatchingString(arr1, arr2);
    }

    private static void findMatchingString(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j]) && i != j){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
