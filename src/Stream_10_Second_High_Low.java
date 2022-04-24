import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stream_10_Second_High_Low {
    //Programs to print second highest & Lowest Number from the list using string

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 33, 22, 55, 3, 0, 22, 4, 5, 66, 4, 33, 32, 22, 5, 65);

        //Printing second highest number from the list

        int secondHighest = list.stream()
                .sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

        System.out.println("Second highest number is : "+secondHighest);

        int secondLowest = list.stream()
                .sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Lowest number is : "+secondLowest);

    }
}
