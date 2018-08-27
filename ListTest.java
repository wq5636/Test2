package comp1110.nestedClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mac on 25/8/18.
 */
public class ListTest {


    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Maxim", 9),
                new Person("dash", 11),
                new Person("gabe", 11),
                new Person("zj", 23)
        );
        List<Person> filter_persons = persons.stream()
                .filter(p -> p.getAge()>11)
                .filter(p -> p.getName().startsWith("z"))
                .collect(Collectors.toList());
        filter_persons.stream().forEach(p -> System.out.println(p.getName()+": "+p.getAge()));


    }
}
