package Automobil;

public class Automobil {
    // 5 obeležja sa različitim tipovima
    String marka;        // String
    String model;        // String  
    int godina;          // int
    double cena;         // double
    boolean jeNov;       // boolean
    
    // 1. Podrazumevani konstruktor
    public Automobil() {
        marka = "Nepoznato";
        model = "Nepoznato";
        godina = 0;
        cena = 0.0;
        jeNov = false;
    }
    
    // 2. Konstruktor sa 3 parametra (overloading)
    public Automobil(String marka, String model, int godina) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
        this.cena = 10000.0;  // podrazumevana cena
        this.jeNov = true;
    }
    
    // 3. Konstruktor sa svim parametrima (overloading)
    public Automobil(String marka, String model, int godina, double cena, boolean jeNov) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
        this.cena = cena;
        this.jeNov = jeNov;
    }
    
    // Jednostavna metoda za prikaz
    public void prikazi() {
        System.out.println(marka + " " + model + " (" + godina + ")");
        System.out.println("Cena: " + cena + " €");
        System.out.println("Nov: " + (jeNov ? "Da" : "Ne"));
        System.out.println("-------------");
    }
}