package pckg_vj8.auxPckg;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    public static final int LOW = 0;
    public static final int UPP = 120;

    public Generator() {
    }
    public static int genAge2Guess(){
        return ThreadLocalRandom.current().nextInt(LOW, UPP);
    }
}
