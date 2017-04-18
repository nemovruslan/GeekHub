package hw3.geekhubhomework.operations;

import hw3.geekhubhomework.products.Product;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class PrintToConsoleProductsOfBasket extends Operation {
    public void displayContentsOfBasket() {
        System.out.println("********************");
        System.out.println("Contents Of Basket:");
        for (Product product : products) {
            System.out.println(product.getClass().getSimpleName() + ": /Name: " + product.name + " /Price: " + product.getPrice() + " /Quantity: " + product.getQuantity());
        }
        System.out.println("********************");
    }
}
