package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public void calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}