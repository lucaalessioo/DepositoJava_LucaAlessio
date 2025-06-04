public class Studente {
    
    private String nome;
    private int voto;
    private static int id;

    // Costruttore
    public Studente(String nome, int voto) {
        this.nome = nome;
        this.voto = voto;
    }

    // getter
    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    // setter con controllo sul voto 
    public void setVoto(int voto) {
        if(voto < 0 || voto > 10) {
            System.out.println("Il voto deve essere compreso tra 0 e 10");
        } else {
        this.voto = voto;
        System.out.println("Voto modificato con successo");

        }
    }
    // stampa del nome dello studente e del suo voto
    public void stampaDettagli() {
        System.out.println(getNome()+" "+ getVoto());
    }

    
    
}
