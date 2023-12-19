import java.util.concurrent.TimeUnit;

public class App {
    public static void sleep(int sec){
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Motore motore = new Motore();
        Semaforo semaforo = new Semaforo();
        Fotocellula f1 = new Fotocellula();
        Fotocellula f2 = new Fotocellula();
        Fotocellula f3 = new Fotocellula();
        Fotocellula SC_A = new Fotocellula();
        Fotocellula SC_B = new Fotocellula();

        int carrello = 1;
        
        App.sleep(5);
        System.out.println("Il carrello arriva alla fotocellula 1");
        f1.setStatoFC(true);
        semaforo.setAcceso(true);
        System.out.println("Semaforo:" + Semaforo.colore(semaforo.getStatoSf()));
        motore.setStatoM(true);
        motore.setVersoM(true);
        System.out.println("Il motore è acceso, cancello in " + Motore.direzione(motore.getVersoM()));
        App.sleep(1);
        System.out.flush();
        
        SC_A.setStatoFC(true);
        System.out.println("Cancello: APERTO");
        motore.setStatoM(false);
        semaforo.setStatoSf(true);
        System.out.println("Semaforo: " + Semaforo.colore(semaforo.getStatoSf()));
        App.sleep(3);

        System.out.println("Carrello passa il cancello");
        f1.setStatoFC(false);
        f3.setStatoFC(true);

        App.sleep(5);
        System.out.println("/033[H\033[2J");
        System.out.flush();

        System.out.println("Il carrello arriva alla fotocellula 2");
        f2.setStatoFC(true);
        do {
            if (carrello!=5){
                f3.setStatoFC(true);
            }else{
                f3.setStatoFC(false);
            }
            carrello++;
        } while (f3.getStatoFC() == false);
        SC_A.setStatoFC(false);
        semaforo.setStatoSf(false);
        motore.setStatoM(true);
        motore.setVersoM(false);
        System.out.println("Cancello in " + Motore.direzione(motore.getVersoM()));
        System.out.println("Semaforo: " + Semaforo.colore(semaforo.getStatoSf()));
        App.sleep(3);
        System.out.flush();
        System.out.println("Il carrello è arrivato a destinazione");
        f2.setStatoFC(false);
        SC_B.setStatoFC(true);
        motore.setStatoM(false);
        System.out.println("Cancello: CHIUSO");
    }
}
