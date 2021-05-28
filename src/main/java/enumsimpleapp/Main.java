package enumsimpleapp;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car type from the list.");
        System.out.println(Arrays.asList(Car.values()));

        String line = scanner.nextLine();

        line = line.toUpperCase(Locale.ROOT);
        line = line.trim();

        try {
            Car chosenCar = Car.valueOf(line);
            System.out.println("Thank u for choosing " + line.toLowerCase() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("There is no such type in our offer.");
        }
    }
}
