package code.java8;

public class DefaultMethodDaimondProbExample {

    public static void main(String[] args) {

    }
}

interface A{
    default void m1(){
        System.out.println("A::m1");
    }
}
interface B{
    default void m1(){
        System.out.println("B::m1");
    }
}
class Class implements  A, B{

    @Override
    public void m1() {
        A.super.m1();
    }
}