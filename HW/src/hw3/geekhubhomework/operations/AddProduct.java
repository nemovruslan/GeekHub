package hw3.geekhubhomework.operations;

import hw3.geekhubhomework.products.Product;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class AddProduct extends Operation {
    public void add(Product product) {
        products.add(product);
/*        for (Product product1 : products) {
            System.out.println(product1.getName());
        }*/
    }
}
