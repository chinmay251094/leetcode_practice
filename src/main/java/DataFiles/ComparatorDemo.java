package DataFiles;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    @Test
    public void comparatorDemo() {
        String[] arr = {"K", "1", "4", "3", "2", "5", "6", "0"};
        List<String> arrList = Arrays.asList(arr);

        Assertions.assertThat(arrList).isSortedAccordingTo(new Comparator<String>() {
            public int compare(String a, String b) {
                if(a.equalsIgnoreCase(b)) {
                    return 0;
                }
                else if(a.equalsIgnoreCase("K")) {
                    return -1;
                }
                else if(a.equalsIgnoreCase("0")) {
                    return 1;
                }
                else if(b.equalsIgnoreCase("K")) {
                    return 1;
                }
                else if(b.equalsIgnoreCase("0")) {
                    return -1;
                }
                return Integer.parseInt(a) - Integer.parseInt(b);
            }
        });
    }
}
