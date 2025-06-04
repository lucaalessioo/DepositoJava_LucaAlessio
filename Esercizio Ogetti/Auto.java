public class Auto {

    // Variabili
    String targa;
    String modello;
    Utente propietario;

    // Costruttore
    public Auto(String targa, String modello, Utente propietario) {
        this.targa = targa;
        this.modello = modello;
        this.propietario = propietario;
    }

    // Metodo toString per la stampa dell oggetto
    @Override
    public String toString() {
        return "Targa: " + targa + ", Marca: " + modello + ", Proprietario: " + propietario;
    }
    
    
}
