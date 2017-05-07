package ohtu.kivipaperisakset;

/**
 *
 * @author Raine Rantanen
 */
public class Yksinpeli extends Peli {

    public Yksinpeli() {
    }

    public Yksinpeli(Tekoaly tekoaly) {
        super(tekoaly);
    }

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        String eka, toka;
        
        do {
            eka = kayttoliittyma.LueSiirto("eka");
            if(!onOkSiirto(eka))break;
            toka = tekoaly.annaSiirto();
            kayttoliittyma.tulostaKoneenValinta(toka);
            tekoaly.asetaSiirto(toka);
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
