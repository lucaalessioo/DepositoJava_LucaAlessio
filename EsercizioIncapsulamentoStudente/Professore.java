import java.util.ArrayList;

public class Professore {
    
    private String nome;
    private String cognome;
    ArrayList<Studente> listaStudenti;

    // Costruttore
    public Professore(String nome, String cognome, ArrayList<Studente> listaStudenti) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaStudenti = new ArrayList<>();
    }
    
    
    // Getter e Setter
    public String getNome() {
        return nome;
    }



    public String getCognome() {
        return cognome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setCognome(String cognome) {
        this.cognome = cognome;
    }



    // Metodo per aggiungere lo studente alla lista del prof
    public void addStudente(Studente studente) {
        listaStudenti.add(studente);
    }

    // Metodo per stampare la lista dei prof
    public void stampaLista() {
        for(Studente studente : listaStudenti) {
            System.out.println(studente);
        }
    }

    
}
