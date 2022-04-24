import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_04_Even_Odd_Numbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> EvenNumbers = list.stream()
                .filter(e -> e % 2 == 0).collect(Collectors.toList());

        List<Integer> OddNumbers = list.stream().filter(e -> e % 2!= 0).collect(Collectors.toList());

        System.out.println("ODD number list : "+OddNumbers);

        System.out.println("Even number list : "+EvenNumbers);



    }
}
