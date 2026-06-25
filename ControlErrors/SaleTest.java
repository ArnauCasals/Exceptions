package Exceptions.ControlErrors;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {

    public static void run() {

        try {
            Sale emptySale = new Sale();

            emptySale.calculateTotal();

        } catch (EmptySaleException emptySaleException) {
            System.out.println("Error: " + emptySaleException.getMessage());
        }

        try {
            List<String> list = new ArrayList<>();

            list.add("A");
            list.add("B");

            System.out.println(list.get(5));

        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Error de llista: " + indexOutOfBoundsException.getMessage());
        }
    }
}