package DataFiles;

import java.util.*;

public class CustomCompare {
    public static void main(String[] args) {
        map.put(1, "K");
        map.put(2, "1");
        map.put(4, "3");
        map.put(3, "2");
        map.put(6, "5");
        map.put(5, "4");
        map.put(7, "0");

        sortbykey();
    }

    static Map<Integer, String> map = new HashMap<>();
    public static void sortbykey()
    {
        // TreeMap to store values of HashMap
        TreeMap<Integer, String> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
//        for (Map.Entry<Integer, String> entry : sorted.entrySet())
//        {
//            System.out.println(entry.getValue());
//        }

        List<String> list = new ArrayList<String>(map.values());
        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
