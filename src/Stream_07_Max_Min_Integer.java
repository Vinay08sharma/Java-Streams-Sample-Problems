import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream_07_Max_Min_Integer {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,-1 , 1, 22, 33, 22, 55, 3366, 776, 335);

        int maxNumber = list.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(maxNumber);

        int min = list.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(min);
    }
}
