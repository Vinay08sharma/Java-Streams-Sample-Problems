import java.util.Arrays;
import java.util.List;

public class Stream_02_Average_Of_Numbers {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        double averageValue = integers.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Averge value is : "+averageValue);
    }
}
