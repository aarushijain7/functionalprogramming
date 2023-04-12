package code.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Date> getDate = () -> new Date();

        System.out.println("getCurrent date:"+getDate.get());
    }
}
