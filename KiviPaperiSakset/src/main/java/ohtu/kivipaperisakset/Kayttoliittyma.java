package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Raine Rantanen
 */
public class Kayttoliittyma {

    private static final Scanner lukija = new Scanner(System.in);

    public Kayttoliittyma() {
    }

    public static void kaynnista() {
        while (true) {
            tulostaAlkuvalikko();

            String valinta = lukija.nextLine();

            if (!korrektiValinta(valinta)) {
                break;
            } else {
                aloitaPeli(valinta);
            }
        }
    }

    private static void aloitaPeli(String valinta) {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        Peli peli = KSP.valitsePelimuoto(valinta);
        peli.pelaa();
    }

    private static boolean korrektiValinta(String valinta) {
        return (valinta.endsWith("a") || valinta.endsWith("b") || valinta.endsWith("c"));
    }

    private static void tulostaAlkuvalikko() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }

    public void tulostaTilanne(Tuomari tuomari) {
        System.out.println(tuomari);
        System.out.println();
    }

    public void tulostaLopputilanne(Tuomari tuomari) {
        System.out.println();
        System.out.println("Kiitos!");
        tulostaTilanne(tuomari);
    }

    public String LueSiirto(String pelaaja) {
        tulostaValittuPelaaja(pelaaja);
        String siirto = lukija.nextLine();
        System.out.println(siirto);
        return siirto;
    }

    private void tulostaValittuPelaaja(String pelaaja) {
        if (pelaaja.equals("eka")) {
            System.out.print("Ensimmäisen pelaajan siirto: ");
        } else if (pelaaja.equals("toka")) {
            System.out.print("Toisen pelaajan siirto: ");
        }
    }

    public void tulostaKoneenValinta(String valinta) {
        System.out.println("Tietokone valitsi: " + valinta);
    }

}
