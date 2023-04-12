package code.java8;

import java.util.function.Predicate;

public class PredicateSimpleExample {
    public static void main(String[] args) {
        Predicate<String> checkLength = s->s.length()>5;
        Predicate<String> checkStartwithA = s->s.startsWith("A");

        System.out.println(checkLength.and(checkStartwithA).test("Aarushi"));;
    }
}
