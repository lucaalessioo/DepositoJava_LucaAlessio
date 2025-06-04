public class Utente {

    // Variabili
    String nome;
    String cognome;

    // Costruttore
    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // Metodo toString per la stampa dell oggetto
    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
