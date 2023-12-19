public class Semaforo {
    private boolean statoSF;
    private boolean acceso;

    Semaforo() {
        statoSF = false;
        acceso = false;
    }

    public void setStatoSf(boolean stato) {
        statoSF = stato;
    }

    public void setAcceso(boolean stato) {
        acceso = stato;
    }

    public boolean getStatoSf() {
        return statoSF;
    }  

    public boolean getAcceso() {
        return acceso;
    }

    public static String colore( boolean Stato){
        String colore = "";
        if (Stato){
            colore = "VERDE";
        } else {
            colore = "ROSSO";
        }
        return colore;
    }
    
}