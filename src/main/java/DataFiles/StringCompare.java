package DataFiles;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare {
    @Test
    public void testCompare() {
        String[] arr = {"A", "B", "G", "E"};
        List<String> arrList = Arrays.asList(arr);

        Assertions.assertThat(arrList).isSortedAccordingTo(new Comparator<String>() {
            public int compare(String a, String b) {
                int compareAlphabets = a.compareTo(b);

                if(compareAlphabets > 0) {
                    return 1;
                }
                else if(compareAlphabets < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }
}
