package code.java8;

public class DefaultMethodExample {
}

@FunctionalInterface
interface Functional1{

    boolean test();// abstract method
    default void default1(){
        System.out.println("default 1");
    }
    default void default2(){
        System.out.println("default 1");
    }
}
