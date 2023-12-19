public class Fotocellula {
    private boolean statoFC;

    Fotocellula(){
        statoFC=false;
    }

    
    /** 
     * @param stato
     */
    public void setStatoFC(boolean stato){
        statoFC = stato;
    }
    public boolean getStatoFC(){
        return statoFC;
    }
}