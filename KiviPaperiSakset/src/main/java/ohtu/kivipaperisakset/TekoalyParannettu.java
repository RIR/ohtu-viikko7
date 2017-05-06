package ohtu.kivipaperisakset;

// "Muistava tekoäly"
public class TekoalyParannettu implements Tekoaly {

    private String[] muisti;
    private int vapaaMuistiIndeksi;
    private int k, p, s;

    public TekoalyParannettu(int muistinKoko) {
        muisti = new String[muistinKoko];
        vapaaMuistiIndeksi = 0;
        k = 0;
        p = 0;
        s = 0;
    }

    public void asetaSiirto(String siirto) {
        // jos muisti täyttyy, unohdetaan viimeinen alkio
        if (muistiTaynna()) {
            siirraAlkiot();
            vapaaMuistiIndeksi--;
        }
        muisti[vapaaMuistiIndeksi] = siirto;
        vapaaMuistiIndeksi++;
    }

    private boolean muistiTaynna() {
        return vapaaMuistiIndeksi == muisti.length;
    }

    public String annaSiirto() {
        if (siirtojaAlleKaksi()) {
            return "k";
        }
        laskeSiirrot();
        return valitseSiirto();
    }

    private void siirraAlkiot() {
        for (int i = 1; i < muisti.length; i++) {
            muisti[i - 1] = muisti[i];
        }
    }

    private boolean siirtojaAlleKaksi() {
        return vapaaMuistiIndeksi < 2;
    }

    private void laskeSiirrot() {
        String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];

        for (int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
            if (viimeisinSiirto.equals(muisti[i])) {
                lisaaSiirto(muisti[i + 1]);
            }
        }
    }

    private void lisaaSiirto(String seuraava) {
        if ("k".equals(seuraava)) {
            k++;
        } else if ("p".equals(seuraava)) {
            p++;
        } else {
            s++;
        }
    }

    private String valitseSiirto() {
        // Tehdään siirron valinta esimerkiksi seuraavasti;
        // - jos kiviä eniten, annetaan aina paperi
        // - jos papereita eniten, annetaan aina sakset
        // muulloin annetaan aina kivi
        if (k > p && k > s) {
            return "p";
        } else if (p > k && p > s) {
            return "s";
        } else {
            return "k";
        }

        // Tehokkaampiakin tapoja löytyy, mutta niistä lisää 
        // Johdatus Tekoälyyn kurssilla!
    }
}
