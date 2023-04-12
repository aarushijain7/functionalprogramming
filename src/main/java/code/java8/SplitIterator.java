package code.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {
    public static void main(String args[]) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(78);
        listOfInteger.add(10);
        listOfInteger.add(20);
        listOfInteger.add(30);

        Spliterator<Integer> s = listOfInteger.spliterator();
        Spliterator<Integer> s1 = s.trySplit();

        s.forEachRemaining(System.out::println);
        System.out.println("Traverse Second Half ");
        s1.forEachRemaining(System.out::println);
    }
}
