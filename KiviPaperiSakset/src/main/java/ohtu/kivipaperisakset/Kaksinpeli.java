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
            if(!onOkSiirto(eka))break;
            toka = kayttoliittyma.LueSiirto("toka");
             if(!onOkSiirto(toka))break;
            tuomari.kirjaaSiirrot(eka, toka);
            kayttoliittyma.tulostaTilanne(tuomari);
        } while (true);

        kayttoliittyma.tulostaLopputilanne(tuomari);
    }

    @Override
    protected boolean onOkSiirto(String siirto) {
        return super.onOkSiirto(siirto);
    }
}
