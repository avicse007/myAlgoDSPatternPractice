import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(i -> System.out.println(i));
        // Call by method reference
        list.forEach(System.out::println);
        // Stream.of(list).filter(i -> i % 2 == 0).forEach(System.out::println);
    }

}
