package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Raine Rantanen
 */
public class KSP {

    public KSP() {
    }

    public static Peli valitsePelimuoto(String pelimuoto) {
        Map<String, Peli> valinta = new HashMap();
        valinta.put("a", kaksinpeli());
        valinta.put("b", helppoYksinpeli());
        valinta.put("c", vaikeaYksinpeli());

        return valinta.get(pelimuoto);
    }

    public static Yksinpeli helppoYksinpeli() {
        return new Yksinpeli(new TekoalyPerus());
    }

    public static Yksinpeli vaikeaYksinpeli() {
        return new Yksinpeli(new TekoalyParannettu(20));
    }

    public static Kaksinpeli kaksinpeli() {
        return new Kaksinpeli();
    }
}
