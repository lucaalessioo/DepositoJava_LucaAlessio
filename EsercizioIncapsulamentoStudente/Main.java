import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Studente studente = new Studente("luca", 7);
         ArrayList<Studente> listaStudenti = new ArrayList<>();

        studente.stampaDettagli();

        // setto il voto errato
        studente.setVoto(11);
        
        // setto il voto corretto
        studente.setVoto(5);

        // stampa dei dettagli
        studente.stampaDettagli();

        Professore professore = new Professore("mauro" , "belli",listaStudenti);
        professore.addStudente(studente);

        System.out.println("Lista di studenti per il proff");
        professore.stampaLista();
    }
}
