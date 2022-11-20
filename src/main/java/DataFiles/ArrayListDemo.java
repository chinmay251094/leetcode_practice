package DataFiles;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(5);

        for (int i = 0; i < 10; i++) {
            myList.add("Komal");
        }

        System.out.println(myList);
    }
}
