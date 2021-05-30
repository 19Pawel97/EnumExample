package enumbikeex;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rower {
    private int ilośćPrzerzutek;
    private TypRoweru typRoweru;
    private String nazmaRoweru;

    public void wypiszInfoORowerze() {
        System.out.println(this.getNazmaRoweru());
        System.out.println(this.typRoweru);
        System.out.println(this.ilośćPrzerzutek);
        System.out.println(typRoweru.pobierzIlośćMiejsc());
    }
}
