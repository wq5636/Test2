package comp1110.nestedClass;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mac on 25/8/18.
 */
public class SetTest {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(10, 20, 20, 30, 40);
        System.out.println("use distinct() to print:");
        integerStream.distinct().forEach(System.out::println);
        System.out.println();
        System.out.println("use filter:");
        IntStream.range(1,5)
                .filter(s -> s>2)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("use limit()");
        Stream<Integer> StreamInterate = Stream.iterate(40, n -> n+2).limit(5);
        StreamInterate.forEach(System.out::println);
        System.out.println();


    }
}
