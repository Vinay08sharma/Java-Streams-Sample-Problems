import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_05_Number_Starts_with {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 22, 44, 33, -222, -221, 241, 423, -2153);
        List<Integer> numberStartsWith2 = list.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                .map(e -> Integer.valueOf(e))
                .collect(Collectors.toList());

        System.out.println(numberStartsWith2);
    }
}
