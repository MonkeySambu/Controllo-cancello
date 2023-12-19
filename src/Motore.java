public class Motore {
    private boolean statoM;
    private boolean versoM;

    Motore() {
        statoM = false;
        versoM = false;
    }

    
    /** 
     * @param stato
     */
    public void setStatoM(boolean stato) {
        statoM = stato;
    }

    public void setVersoM(boolean stato) {
        versoM = stato;
    }

    public boolean getStatoM() {
        return statoM;
    }

    public boolean getVersoM() {
        return versoM;
    }

    public static String direzione(boolean verso) {
        String direzione = "";
        if (verso) {
            direzione = "Apertura";
        } else {
            direzione = "Chiusura";
        }
        return direzione;
    }
}
