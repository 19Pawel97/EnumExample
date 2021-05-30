package enumcoffeeapp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

//Stwórz enum RodzajKawy (ARABICA, ​ LIBERICA, ROBUSTA), oraz enum
//PochodzenieKawy (COLUMBIA, BRASIL, INDIE), oraz klasę Kawa.
//a. Klasa Kawa powinna mieć pola:
//i. nazwa,
//ii. data parzenia,
//iii. rodzaj kawy (pole rodzaju RodzajKawy),
//iv. pochodzenie kawy (pole rodzaju PochodzenieKawy)
//b. Stwórz listę, dodaj do niej kilka rodzajów kawy (na “sztywno”)
//c. * stwórz Scanner i pozwól używkonikowi podać dane swojej ulubionej kawy
//(formularz, niech wpisze wszystkie pola niezbędne do stworzenia instancji
//obiektu Kawa). Po stworzeniu instancji, dodaj go do listy. Przeiteruj listę i
//wypisz na ekran ​ wszystkie (pozostałe) kawy które są tego samego
//rodzaju, ale innego pochodzenia
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kawa {
    private String nazwa;
    private LocalDate dataParzenia;
    private RodzajKawy rodzajKawy;
    private PochodzenieKawy pochodzenieKawy;
}
