package enumtickeapp;

import java.util.Scanner;

//Stwórz enum Bilet.:
//a. Rodzaje biletów:
//i. NORMLANY_GODZINA, - cena 1.70
//ii. ULGOWY_STUDENCKI, - cena 0.90
//iii. NORMALNY_CALODNIOWY. - cena 5.30
//iv. ULGOWY_EMERYT, - cena 0.30
//b. Stwórz aplikację w rodzaju formularza. Zapytaj użytkownika o rodzaj biletu i
//po wpisaniu odpowiedniej wartości wyświetl mu cenę.
//c. Rozwiń program. Zapytaj również o ilość, a następnie przekalkuluj cenę.
//d. Rozwiń program, zpytaj ile użytkownik ma zamiar zapłacić (np. do zapłaty jest
//33.20 zł, a użytkownik odpowiada (na pytanie ile zapłaci) 50 zł. Wtedy my
//wypisujemy resztę). Jeśli użytkownik poda zbyt małą kwotę, (np. 20zł, a do
//zapłaty jest 30) to wypisujemy “​ a co pan sobie tutaj tera, jakieś jaja robi?​ ” i
//wymuś ponowne wpisanie kwoty. Próbę powtórz maksymalnie 3 razy.
//e. * dla chętnych - poszperaj trochę o polach wewnątrz enum. Enum może
//posiadać metody oraz pola. Tutaj link: ​ do strony 1​ , ​ tutaj link do strony 2​ .
//Postaraj się przechować cenę biletu wewnątrz enum
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rodzaj biletu: ");
        System.out.println("NORMALNY_GODZINA\n" +
                "ULGOWY_STUDENCKI\n" +
                "NORMALNY_CALODNIOWY\n" +
                "ULGOWY_EMERYT");
        String line = scanner.nextLine();
        System.out.print("Podaj ilość: ");
        int ilość = scanner.nextInt();
        System.out.println("Cena biletu to " + Bilet.valueOf(line.toUpperCase()).getCenaBiletu());
        double sumaCen = ilość * Bilet.valueOf(line.toUpperCase()).getCenaBiletu();
        System.out.println("Cena wszystkich wybranych biletów to: " + sumaCen);
        System.out.println("Ile masz zamiar zapłacić?");
        double zapłata = scanner.nextDouble();
        double reszta = zapłata - sumaCen;
        if (reszta >= 0) {
            System.out.println("Twoja reszta to " + reszta);
        } else {
            int counter = 0;
            do {
                System.out.println("a co pan sobie tutaj tera, jakieś jaja robi?");
                System.out.println("Ile masz zamiar zapłacić?");
                double zapłata1 = scanner.nextDouble();
                double reszta1 = zapłata1 - sumaCen;
                counter ++;
            } while (reszta < 0 && counter < 3);
        }


    }

}
