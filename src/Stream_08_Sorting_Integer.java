import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_08_Sorting_Integer {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 2, 44, 6, 54, 44, 6, 4, 3, 1, 6, 7, 8, 8);

        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> reverse = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);
    }
}
