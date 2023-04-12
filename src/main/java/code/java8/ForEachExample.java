package code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ForEachExample {

    public static void main(String[] args) {
        List<Person> list= Arrays.asList(
                new Person("Aarushi","Jain"),
                new Person("Binta","Chowdhary"),
                new Person("Deepanshu","Jain"),
                new Person("Dhruvi","Jain"),
                new Person("Aarushi","Sharma"),
                new Person("Archana","Muku")
        );

        // traditional for each loop
        for (Person p: list
             ) {
            System.out.println(p);
        }

        //Java 8 for each
        list.forEach(p-> System.out.println(p));
        //using method reference
        list.forEach(System.out::println);


        //using streams
        list.stream()
                .filter(p->p.getFname().toLowerCase(Locale.ROOT).startsWith("A"))
                .forEach(System.out::println);
    }
}
