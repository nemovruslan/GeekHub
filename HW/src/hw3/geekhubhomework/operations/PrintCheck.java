package hw3.geekhubhomework.operations;

import hw3.geekhubhomework.products.Product;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class PrintCheck extends Operation {
    public void displayTotalPrice() {
        PrintToConsoleProductsOfBasket printToConsoleProductsOfBasket = new PrintToConsoleProductsOfBasket();
        printToConsoleProductsOfBasket.displayContentsOfBasket();
        totalPrice();
    }

    private void totalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price;
        }
        System.out.println("Total price is: " + totalPrice);
    }
}
