package ohtu.kivipaperisakset;

/**
 *
 * @author Raine Rantanen
 */
public class Kaksinpeli extends Peli {

    public Kaksinpeli() {
        super();
    }

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        String eka,toka;
        do {
            eka = kayttoliittyma.LueSiirto("eka");
            toka = kayttoliittyma.LueSiirto("toka");
            tuomari.kirjaaSiirrot(eka, toka);
            kayttoliittyma.tulostaTilanne(tuomari);

        } while (onOkSiirto(eka) && onOkSiirto(toka));

        kayttoliittyma.tulostaLopputilanne(tuomari);
    }

    @Override
    protected boolean onOkSiirto(String siirto) {
        return super.onOkSiirto(siirto);
    }
}
