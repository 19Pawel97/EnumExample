package enumsimpleapp;

import java.util.Scanner;

public class MainChoosingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car;

        do{
            System.out.println("Enter car type number choosing it from the list below: ");

            for (int i = 0; i < Car.values().length; i++) {
                System.out.println(i + 1 + ". " + Car.values()[i]);
            }

            int carNum = scanner.nextInt();

            switch (carNum) {
                case 1:
                    car = Car.SEDAN;
                    break;
                case 2:
                    car = Car.SUV;
                    break;
                case 3:
                    car = Car.HATCHBACK;
                    break;
                case 4:
                    car = Car.CONVERTIBLE;
                    break;
                default:
                    car = null;
                    break;
            }
        } while(car == null);

        System.out.println("Thank you for choosing " + car.name().toLowerCase() + ".");
    }
}
