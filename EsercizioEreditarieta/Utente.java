import java.util.Random;

public class Utente {
    Random random = new Random();
    private String nome;
    private String email;
    private float soldi;

    // Costruttore con generazione random sui soldi dell utente
    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.soldi = random.nextInt(10);
    }

    // Getters Setters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public float getSoldi() {
        return soldi;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSoldi(float soldi) {
        this.soldi = soldi;
    }
    // toString
    @Override
    public String toString() {
        return "Utente [nome=" + nome + ", email=" + email + ", soldi=" + soldi + "]";
    }
    
    // Stampa dei dettagli dell utente
    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Credito: " + soldi + " euro");
    }
}
