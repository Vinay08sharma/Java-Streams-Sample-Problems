import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_01_Sum_Of_Numbers {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 4, 3, 5, 3, 2, 1);

        Optional<Integer> reduce = integers.stream()
                .reduce((a, b) -> a + b);

        System.out.println(reduce.get());
    }
}
