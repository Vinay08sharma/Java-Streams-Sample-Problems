import java.util.Arrays;
import java.util.List;

public class Stream_03_Square_Of_Numbers {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 20, 30);

        double average = integers.stream()
                .map((a) -> a * a) // square of number
                .filter(e -> e > 100) // get value greater than 100
                .mapToInt(e -> e) // getting average
                .average()
                .getAsDouble();

        System.out.println(average);

    }
}
