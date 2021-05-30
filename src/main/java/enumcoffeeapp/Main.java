package enumcoffeeapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Kawa kawa1 = new Kawa("Cappuccino", LocalDate.now(), RodzajKawy.ARABICA, PochodzenieKawy.BRASIL);
        Kawa kawa2 = new Kawa("Latte", LocalDate.now(), RodzajKawy.LIBERICA, PochodzenieKawy.COLUMBIA);
        Kawa kawa3 = new Kawa("Mocca", LocalDate.now(), RodzajKawy.ROBUSTA, PochodzenieKawy.INDIE);
        Kawa kawa4 = new Kawa("Machiato", LocalDate.now(), RodzajKawy.ARABICA, PochodzenieKawy.BRASIL);
        Kawa kawa5 = new Kawa("Espresso", LocalDate.now(), RodzajKawy.LIBERICA, PochodzenieKawy.COLUMBIA);

        List<Kawa> kawy = new ArrayList<>();
        kawy.add(kawa1);
        kawy.add(kawa2);
        kawy.add(kawa3);
        kawy.add(kawa4);
        kawy.add(kawa5);

        for (Kawa kawa : kawy) {
            System.out.println(kawa);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Twoja ulubiona kawa to: ");
        System.out.print("nazwa - ");
        String name = scanner.nextLine();
        System.out.print("data parzenia - ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("rodzaj kawy - ");
        String type = scanner.nextLine();
        System.out.print("pochodzenie kawy - ");
        String originPlace = scanner.nextLine();
        System.out.println();

        Kawa kawaOdUrzytkownika = new Kawa(name, date, RodzajKawy.valueOf(type.toUpperCase().trim()), PochodzenieKawy.valueOf(originPlace.toUpperCase().trim()));

        System.out.println(kawaOdUrzytkownika);
        System.out.println();

        kawy.add(kawaOdUrzytkownika);
        System.out.print("Coffee of this type may also come from ");
        for (Kawa kawa : kawy) {
            if (kawa.getRodzajKawy().equals(kawaOdUrzytkownika.getRodzajKawy()) && !kawa.getPochodzenieKawy().equals(kawaOdUrzytkownika.getPochodzenieKawy())) {
                System.out.println(kawa.getPochodzenieKawy());
            }
        }


    }
}