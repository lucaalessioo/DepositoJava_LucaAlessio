public class Aereo {

    private String modello;
    private int numeroPosti;
    private  static int contatore=0;  // Variabile statica che verra assegnata all id dell aero
    private int id;

    // Costruttore
    public Aereo(String modello, int numeroPosti) {
        this.modello = modello;
        this.numeroPosti = numeroPosti;
        contatore++;
        this.id=contatore;
    }

    //Getters Setters
    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public int getId() {
        return id;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    // set impostato per numero di posti maggiori di 0 
    public void setNumeroPosti(int numeroPosti) {
        if(numeroPosti > 0) {
        this.numeroPosti = numeroPosti;
        }else {
            System.out.println("Errore. Inserisci un valore positivo!");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aereo [modello=" + modello + ", numeroPosti=" + numeroPosti + ", id=" + id + "]";
    }

    
}