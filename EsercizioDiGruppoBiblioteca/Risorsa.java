public class Risorsa {
    private int id;
    private String nome;
    private boolean disponibile;

    public Risorsa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.disponibile = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }


    public void visualizzaDettagli() {
        System.out.println(toString());
    }

    // toString in base alla disponibilita della risora
    @Override
    public String toString() {
        return "[" +" ID: " + id + " - Nome: " + nome +
               " - " + (disponibile ? "Disponibile" : "Non disponile. Risorsa in prestito");
    }
}
