import java.util.Collections;
import java.util.List;

public  class Main {
    public static void main(String[] args) {
        List<Double> numbers = List.of(1.0 , 2.0, 3.0, 4.0);
        System.out.println("Наибольшее из чилел: " + Collections.max(numbers));
    }
}