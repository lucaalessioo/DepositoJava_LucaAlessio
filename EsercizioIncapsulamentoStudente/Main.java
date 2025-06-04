public class Main {

    public static void main(String[] args) {
        Studente studente = new Studente("luca", 7);

        System.out.println("Studente : " +studente.getNome()+ " Voto " +studente.getVoto());

        // setto il voto errato
        studente.setVoto(11);
        
        // setto il voto corretto
        studente.setVoto(5);

        // stampa dei dettagli
        studente.stampaDettagli();
    }
}