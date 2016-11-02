package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Руслан on 02.11.2016.
 */
public class Validator {
    private static String phone;
    private static Matcher matcher;
    private static Integer calculationNumber;

    public static void main(String[] args) throws IOException {
        getValidatePhoneNumber();
        getPhoneNumber();
        getCalculationNumber();
        outputReasult();
    }

    private static void outputReasult() {
        System.out.print("Result is: ");
        switch (calculationNumber){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println(calculationNumber);
                break;
        }
    }

    private static void getCalculationNumber() {
        char[] arrayCharsPhone;
        do {
            calculationNumber = 0;
            arrayCharsPhone = phone.toCharArray();
            for (char i : arrayCharsPhone) {
                calculationNumber += Character.getNumericValue(i);
            }
            phone = calculationNumber.toString();
        } while (!(phone.length() == 1));
    }

    private static void getPhoneNumber() {
        Scanner scanner = new Scanner(phone);
        phone = scanner.findInLine("\\d+");
    }

    private static void getValidatePhoneNumber() throws IOException {
        do {
            getInputLine();
            Pattern pattern = Pattern.compile("((\\+?[0]*38)?|8)(039|050|063|066|067|068|091|092|093|094|095|096|097|098|099)\\d{7}");
            matcher = pattern.matcher(phone);
        } while (!matcher.matches());
    }

    private static void getInputLine() throws IOException {
        System.out.println("Input phone number, please. In format +38 X X X _ _ _ _ _ _ _  or X X X _ _ _ _ _ _ _.\n" +
                "(X X X) must be 039|050|063|066|067|068|091|092|093|094|095|096|097|098|099.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        phone = reader.readLine();
    }
}
