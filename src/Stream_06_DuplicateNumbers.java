import java.util.*;
import java.util.stream.Collectors;

public class Stream_06_DuplicateNumbers {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 2, 3, 2, 44, 6, 54, 44, 6, 4, 3, 1, 6, 7, 8, 8);

        Set<Integer> duplicateValues = integers.stream()
                .filter(e -> Collections.frequency(integers, e) > 1).collect(Collectors.toSet());

        System.out.println(duplicateValues);

        // Another way using set
        Set<Integer> set = new HashSet<>();

        Set<Integer> collect = integers.stream()
                .filter(e -> !set.add(e)).collect(Collectors.toSet());

        System.out.println(collect);
    }
}
