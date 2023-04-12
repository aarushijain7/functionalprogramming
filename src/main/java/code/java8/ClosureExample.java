package code.java8;


import java.util.Arrays;
import java.util.List;

public class ClosureExample {
    public static void main(String[] args) {
        List<Integer > list= Arrays.asList(12,12,13,14);
        int b=2;// we can use local variable in lambda implementation
                // only if variable is final or effectively final
                // (value must not be changing through out the program)
        processing(list, i-> System.out.println(i+b));


        processing(list, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i+b);
            }
        });
    }

    public static void processing(List<Integer> list, Process p){
        for (Integer i:list
             ) {
            p.process(i);
        }
    }

}
@FunctionalInterface
interface Process{
    public void process(int i);
}