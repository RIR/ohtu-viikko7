package ohtu.kivipaperisakset;

public class TekoalyPerus implements Tekoaly {

    int siirto;

    public TekoalyPerus() {
        siirto = 0;
    }

    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;
        switch (siirto) {
            case 0:
                return "k";
            case 1:
                return "p";
            default:
                return "s";
        }
    }

   public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
