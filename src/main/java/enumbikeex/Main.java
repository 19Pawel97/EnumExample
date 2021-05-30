package enumbikeex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rower rower1 = new Rower(6,TypRoweru.ROWER,"Rower1");
        Rower rower2 = new Rower(5,TypRoweru.TANDEM,"Rower2");
        Rower rower3 = new Rower(4,TypRoweru.ROWER,"Rower3");

        List<Rower> rowery = new ArrayList<>();

        rowery.add(rower1);
        rowery.add(rower2);
        rowery.add(rower3);

        for (Rower rower : rowery) {
            rower.wypiszInfoORowerze();
        }

    }
}
