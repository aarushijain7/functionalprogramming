package code.java8;

public class RunnableExample {
    public static void main(String[] args) {
        // Usign anonymous class
        Thread t= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous class implementation");
            }
        });
        t.start();

        //using Lambda
        Thread t1 = new Thread(()-> System.out.println("Inside Lambda class implementation"));
        t1.start();
    }
}
