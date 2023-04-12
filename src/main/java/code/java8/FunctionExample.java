package code.java8;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num*num;
        System.out.println("square of 2:"+square.apply(2));

        Function<Integer,Integer> divideBy2 = num->num/2;
        System.out.println("12/2:"+divideBy2.apply(12));

        //Function chaining
        // with andThen()
        //f1.andThen(f2).apply(input) - first f1 and then f2
        System.out.println("square 4 and then divide by 2:"+square.andThen(divideBy2).apply(4));

        //with compose
        //f1.compose(f2).apply(input) - first f2 then f1
        System.out.println("divide 4 by 2 and then sqauring:"+square.compose(divideBy2).apply(4));
    }
}
