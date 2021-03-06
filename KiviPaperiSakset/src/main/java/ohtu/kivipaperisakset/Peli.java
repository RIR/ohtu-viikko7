package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Raine Rantanen
 */
public abstract class Peli {

    protected Kayttoliittyma kayttoliittyma;
    protected Tekoaly tekoaly;

    protected Peli() {
        this.kayttoliittyma = new Kayttoliittyma();
    }

    protected Peli(Tekoaly tekoaly) {
        this.tekoaly = tekoaly;
        this.kayttoliittyma = new Kayttoliittyma();
    }

    protected abstract void pelaa();

    protected boolean onOkSiirto(String siirto) {
        return siirto.equals("k") || siirto.equals("p") || siirto.equals("s");
    }
}
