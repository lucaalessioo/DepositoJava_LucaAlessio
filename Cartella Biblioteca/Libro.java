
public class Libro {

        //creazione delle variabili
        String titolo;
        String autore;
        int prezzo;
        static int codice_numerico_autoincrementate;

        //costruttore con assegnazione delle variabili 
        Libro(String titolo,String autore,int prezzo) {
            this.titolo = titolo ;
            this.autore = autore;
            this.prezzo = prezzo;

            codice_numerico_autoincrementate++;
        }

        //metodo per la stampa dei dettagli
        public void stampaDettagli() {
            System.out.println("titolo = "+ titolo + "autore = " +autore + prezzo);
        }


}
