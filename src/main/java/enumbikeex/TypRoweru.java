package enumbikeex;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TypRoweru {
    ROWER(1),
    TANDEM(2);

    private final int ilośćMiejsc;

    public int pobierzIlośćMiejsc() {
        return ilośćMiejsc;
    }
}
