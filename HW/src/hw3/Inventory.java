package hw3;

import hw3.operations.AddProduct;
import hw3.operations.PrintCheck;
import hw3.operations.PrintToConsoleProductsOfBasket;
import hw3.operations.RemoveProduct;
import hw3.products.Bread;
import hw3.products.Cheese;
import hw3.products.Fish;
import hw3.products.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan on 23.11.2016.
 */
public class Inventory {

    private void printMenuToConsole() {
        System.out.println("Choose operation:\n" +
                "1 Add the product\n" +
                "2 Remove product\n" +
                "3 Display the contents of the basket\n" +
                "4 Display check the screen and exit");
    }

    protected void chooseNecessaryOperation() throws IOException {
        int numberMenu;
        do {
            printMenuToConsole();
            numberMenu = getNumberOfMenu();
            switch (numberMenu) {
                case 1:
                    AddProduct addProduct = new AddProduct();
                    chooseNecessaryProductForAdd(addProduct);
                    break;
                case 2:
                    RemoveProduct removeProduct = new RemoveProduct();
                    chooseNecessaryProductForRemove(removeProduct);
                    break;
                case 3:
                    PrintToConsoleProductsOfBasket printToConsoleProductsOfBasket = new PrintToConsoleProductsOfBasket();
                    printToConsoleProductsOfBasket.displayContentsOfBasket();
                    break;
                case 4:
                    PrintCheck printCheck = new PrintCheck();
                    printCheck.displayTotalPrice();
                    break;
            }
        } while (numberMenu != 4);
    }

    private void chooseNecessaryProductForRemove(RemoveProduct removeProduct) throws IOException {
        printMenuForRemoveProduct(removeProduct);
        int item = getItem(removeProduct);
        removeProduct.removeNecessaryProduct(item);
    }

    private void printMenuForRemoveProduct(RemoveProduct removeProduct) {
        System.out.println("Choose item:");
        int count = 0;
        for (Product product : removeProduct.products) {
            System.out.println(++count + " " + product.name);
        }
    }

    private int getItem(RemoveProduct removeProduct) throws IOException {
        int item;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            item = Integer.parseInt(reader.readLine());
        } while (removeProduct.products.size() < item);
        return item;
    }

    private void chooseNecessaryProductForAdd(AddProduct addProduct) throws IOException {
        printMenuForChooseProduct();
        int numberOfMenu = getNumberOfMenu();
        switch (numberOfMenu) {
            case 1:
                System.out.println("Input name of product, please.");
                addProduct.add(new Fish(getStringFromConsole(), getPrice(), getQuantity()));
                break;
            case 2:
                System.out.println("Input name of product, please.");
                addProduct.add(new Bread(getStringFromConsole(), getPrice(), getQuantity()));
                break;
            case 3:
                System.out.println("Input name of product, please.");
                addProduct.add(new Cheese(getStringFromConsole(), getPrice(), getQuantity()));
                break;
            case 4:
                break;
        }
    }

    private int getQuantity() throws IOException {
        System.out.println("Input quantity of product, please.");
        int quantity = 0;
        boolean boolSecond = true;
        do {
            try {
                quantity = getIntFromConsole();
                boolSecond = false;
            } catch (NumberFormatException e) {
                System.out.println("Input value is not a number.");
            }
        } while (boolSecond);
        return quantity;
    }

    private double getPrice() throws IOException {
        boolean boolFirst = true;
        double price = 0;
        System.out.println("Input price of product, please.");
        do {
            try {
                price = getDoubleFromConsole();
                boolFirst = false;
            } catch (NumberFormatException e) {
                System.out.println("Input value is not a number.");
            }
        } while (boolFirst);
        return price;
    }

    private int getIntFromConsole() throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private String getStringFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private void printMenuForChooseProduct() {
        System.out.println("Choose product:\n" +
                "1 Fish\n" +
                "2 Bread\n" +
                "3 Cheese\n" +
                "4 Exit");
    }

    private int getNumberOfMenu() throws IOException {
        int line = 0;
        do {
            try {
                line = getValueFromConsole();
            } catch (NumberFormatException e) {
                System.out.println("Write correct number of menu");
            }
        } while (!((line == 1) | (line == 2) | (line == 3) | (line == 4)));
        return line;
    }

    private int getValueFromConsole() throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private double getDoubleFromConsole() throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }


}
