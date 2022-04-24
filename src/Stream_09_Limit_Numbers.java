import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_09_Limit_Numbers {

    // Get the first 5 numbers from the list and than add them

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 76, 8, 8, 9, 90);

        // getting first 5 numbers
        List<Integer> limit = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit);

        //Adding the first 5 numbers
        int limitAddition = limit.stream()
                .reduce((a, b) -> a + b).get();

        System.out.println(limitAddition);

    }

}
