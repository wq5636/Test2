package comp1110.nestedClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mac on 25/8/18.
 */
public class MapTest {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Maxim", 9),
                new Person("Dash", 11),
                new Person("Gabe", 11),
                new Person("Tyler", 23),
                new Person("ZJ", 23)
        );

        Map<Integer, List<Person>> personsByAge = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));

        System.out.println("age groups:");
        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
        personsByAge.forEach((age, p) -> System.out.format("age group %s contains: %s\n", age, p));
        //personsByAge.forEach((age, p) -> System.out.println(age, p));
        System.out.println();
        Map<Integer, String> personsByAge2 = persons.stream()
                .collect(Collectors.toMap(
                        Person::getAge,
                        Person::getName,
                        (name1, name2) -> name1 + "; " + name2
                ));
        System.out.println(personsByAge2);

        System.out.println();
        System.out.println("Average age:");
        Double averageAge = persons.stream()
                .collect(Collectors.averagingInt(p -> p.getAge()));
        System.out.println(averageAge);

        System.out.println();
        System.out.println("try join:");
        String phrase = persons.stream()
                .filter(p -> p.getAge()>18)
                .map(p -> p.getName())
                .collect(Collectors.joining(" and ", "in China, ", " are adults"));
        System.out.println(phrase);

        System.out.println();
        System.out.println();
        System.out.println(personsByAge);

    }
}
