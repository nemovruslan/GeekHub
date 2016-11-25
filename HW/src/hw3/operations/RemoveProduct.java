package hw3.operations;

import java.io.IOException;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class RemoveProduct extends Operation {
    public void removeNecessaryProduct(int item) throws IOException {
        products.remove(item - 1);
    }
}
