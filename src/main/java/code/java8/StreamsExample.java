package code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,13,18,1,3,2);


        //filtering if num is divisible by 2 and then printing
        //.stream().filter(num->num%2==0).map(x->x*x).forEach(System.out::println);

        //sqauring the number and then printing
       // list.stream().map(x->x*x).forEach(System.out::println);

        //using collect
        //List<Integer> collectedList = list.stream().filter(num->num>10).collect( Collectors.toList());
        //collectedList.stream().forEach(System.out::println);

        //list.stream().sorted().forEach(System.out::println);

        //System.out.println(list.stream().min((num1,num2)-> num1.compareTo(num2)).get());
        //System.out.println(list.stream().max((num1,num2)-> num1.compareTo(num2)).get());

        Object[] array = list.stream().toArray();

        Stream.of(new String[]{"BAC", "jsdhsd"}).forEach(System.out::println);


    }
}
