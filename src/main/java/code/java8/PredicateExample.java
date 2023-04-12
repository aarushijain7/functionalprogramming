package code.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<Person> list= Arrays.asList(
                new Person("Aarushi","Jain"),
                new Person("Binta","Chowdhary"),
                new Person("Deepanshu","Jain"),
                new Person("Dhruvi","Jain"),
                new Person("Aarushi","Sharma"),
                new Person("Archana","Muku")
        );

        //Sort elements
        Collections.sort(list,(p1,p2) -> p1.getFname().compareTo(p2.getLname()));

        //print all the element
        //printConditionally(list, );
        System.out.println("Printing all");
        printConditionally(list, p-> true);

        //Print persons whose fname starts with A
        System.out.println("Printing persons whose fname starts with A");
        printConditionally(list, p -> p.getFname().startsWith("A"));

    }

    public static void printConditionally(List<Person> persons, Predicate<Person> predicate){
        for (Person person:persons ) {
            if (predicate.test(person)){
                System.out.println(person);
            }
        }
    }
}
