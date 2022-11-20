package DataFiles;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println(new ListDemo().listReturn());
        System.out.println(new ListDemo().stringReturn());
    }

    public List<String> listReturn() {
        List<String> myList = new ArrayList<>();
        
        return myList;
    }

    public String stringReturn() {
        String name = null;

        return name;
    }
}
