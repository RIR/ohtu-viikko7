package ohtu.kivipaperisakset;

/**
 *
 * @author Raine Rantanen
 */
public class Yksinpeli extends Peli {

    public Yksinpeli(Tekoaly tekoaly) {
        super(tekoaly);
    }

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        String eka, toka;
        do {
            eka = kayttoliittyma.LueSiirto("eka");
            toka = tekoaly.annaSiirto();
            kayttoliittyma.tulostaKoneenValinta(toka);
            tekoaly.asetaSiirto(toka);

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
