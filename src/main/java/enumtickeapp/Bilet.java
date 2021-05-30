package enumtickeapp;

import lombok.Getter;

@Getter
public enum Bilet {
    NORMALNY_GODZINA(1.70),
    ULGOWY_STUDENCKI(0.90),
    NORMALNY_CALODNIOWY(5.30),
    ULGOWY_EMERYT(0.30);

    private final double cenaBiletu;

    Bilet(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }
}
