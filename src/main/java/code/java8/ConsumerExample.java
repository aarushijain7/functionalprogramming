package code.java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> square = a-> System.out.println(a*a);
        square.accept(2);

        BiConsumer<Integer, Integer> add = (a,b)-> System.out.println("a+b:"+a+b);
        add.accept(2,3);

        //Consumer chaining
        square.andThen(square).accept(2);
    }
}
