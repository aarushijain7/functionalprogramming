package code.java8;

import java.util.Arrays;
import java.util.List;

public class ThisReferenceExample {
    public static void main(String[] args) {
        List<Integer > list= Arrays.asList(12,12,13,14);
        processing(list, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);// printing an object of anonymous class
                                            //works fine while using anonymous class
            }
        });

        processing(list, i-> {
            System.out.println(i);
            // System.out.println(this);// doesnt work in case on lambda as it treats it as it is created in a
                                        //static reference.
        });

        ThisReferenceExample obj = new ThisReferenceExample();
        obj.nonStaticMethod(list);

    }
    public void nonStaticMethod(List<Integer> list){
        processing(list, i->{
            System.out.println(i);
            System.out.println(this);// works fine if lambda is defined in a non static reference.
        });

    }
    public static void processing(List<Integer> list, Process p){
        for (Integer i:list
        ) {
            p.process(i);
        }
    }
}

