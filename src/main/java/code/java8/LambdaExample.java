package code.java8;

public class LambdaExample {

    public static void main(String[] args) {
        // creating via Anonymous class
        Add addAnonymousClass = new Add() {
            @Override
            public double add(double firstNum, double secondNum) {
                return firstNum+secondNum;
            }
        };

        // Using Lambda expression
        Add addLambda = (a,b)->a+b;
        Add addLambda1 = (double a, double b) -> { return a+b;};

        // Lambdas with one parameter
        Square square = (s)->{return s*s;};
        Square square1 = (s)-> s*s;
        Square square2 = s->s*s;
        executeLambda(s->s*s);// Can be passed as a parameter in a function


        //Lambdas without argument
        Print printLambda = () -> System.out.println("Print Something");
        Print printLambda1 = () -> {System.out.println("Print Something");};



    }
    public static void executeLambda(Square square){
        square.square(23);
    }
}

interface Add{
    public double add(double firstNum,double secondNum);
}
interface Square{
    public double square (double num);
}
interface Print{
    public void display();
}