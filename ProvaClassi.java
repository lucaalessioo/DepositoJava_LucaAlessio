
import java.util.LinkedList;
import java.util.Scanner;

public class ProvaClassi {
    public static void main(String[] args) {  
      Scanner scanner = new Scanner(System.in);
    /*
    Auto miaAuto = new Auto(); // Creazione oggetto
    miaAuto.marca = "Tesla"; // Assegnazione valori
    miaAuto.anno = 2023;
    miaAuto.prezzo = 59999.99;
    miaAuto.mostraInfo(); // Output: Tesla - 2023 - €59999.99
    */


    /*
    Studente studente = new Studente("Luca");
    Studente studente2 = new Studente("Marco");
    Studente studente3 = new Studente("lorenzo");
    System.out.println(studente.nome);
    System.out.println(Studente.totaleStudenti);
    */

    /* 
    // Creazione dei due libri
    Libro libro1 = new Libro("Primo libro, "," Primo autore, ",10);
    Libro libro2 = new Libro("Secondo libro, ","Secondo autore, " , 20);
    
    //richiamo dei metodi per la stampa dei dettagli
    libro1.stampaDettagli();
    libro2.stampaDettagli();

    System.out.println(Libro.codice_numerico_autoincrementate);
    */
    
    // Auto miaAuto = new Auto("BMW" ,2022);
    /* 
    // inserimento parametri prima persona
    System.out.println("Inserisci il nome: ");
    String nome = scanner.nextLine();
    System.out.println("Inserisci l eta: ");
    int eta = scanner.nextInt();
    
    // pulizia buffer
    scanner.nextLine();
    
    // assegnazione valori piu stampa
    Persona persona = new Persona(nome,eta);
    System.out.println(persona);
    
    // richiesta valori seconda persona
    System.out.println("Inserisci il nome: ");
    String nome2 = scanner.nextLine();
    System.out.println("Inserisci l eta: ");
    int eta2 = scanner.nextInt();
    Persona persona2 = new Persona(nome2,eta2);
    
    // stampa delle persone
    System.out.println(persona);
    System.out.println(persona2);
    */
    int uscita=0;
    LinkedList<Dipendente> listaDipendenti = new LinkedList<>();
    do {
    System.out.println("Menu per la crud dei dipendenti: ");
    System.out.println("Digita 1. INSERISCI DIPENDENTE\n DIGITA 2.LEGGI DIPENDENTE\n DIGITA 3. PER LEGGERE LA LINKEDLIST\n DIGITA 4. AGGIORNA DIPENDENTE\n DIGITA 5 CANECELLA DIPENDENTE\n DIGITA 6 PER USCIRE");
    int scelta = scanner.nextInt();
    scanner.nextLine();
    uscita = scelta;

    // CREATE
    if(scelta == 1) {
    
    // creazione  dipendente
    System.out.println("inserisci il nome del  dipendente: ");
    String nome = scanner.nextLine();
    System.out.println("inserisci lo stipendio del  dipendente ");
    int stipendio = scanner.nextInt();
    scanner.nextLine();

    //inserimento dipendente
    listaDipendenti.add(new Dipendente(nome,stipendio));
    }

    // READ
    if(scelta == 2) {

      // controllo se la lista è vuota 
      if (listaDipendenti.isEmpty()) {
          System.out.println("La lista dei dipendenti è vuota.");
      } else {
              System.out.print("Inserisci l'indice del dipendente da leggere: ");
              int indice = scanner.nextInt();
      // controllo se l indice è valido
              if (indice >= 0 && indice < listaDipendenti.size()) {
                      System.out.println("Dipendente: " + listaDipendenti.get(indice));
          } else {
           System.out.println("Indice non valido.");
                }
        }
      }

    // lettura linkedlist
    if(scelta == 3) {
      if (listaDipendenti.isEmpty()) {
          System.out.println("La lista dei dipendenti è vuota.");
      } else {
      for(Dipendente dipendente : listaDipendenti) {
        System.out.println(dipendente);
         }
      }
    }

  // UPDATE
 if (scelta == 4) {
  
  // controllo se la linked è vuota
    if (listaDipendenti.isEmpty()) {
        System.out.println("La lista dei dipendenti è vuota.");
    } else {
        System.out.print("Inserisci l'indice del dipendente da modificare: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // consuma newline
    
        //controllo validita dell indice se è valido chiedo i nuovi valori
        if (indice >= 0 && indice < listaDipendenti.size()) {
            System.out.print("Inserisci il nuovo nome del dipendente: ");
            String nome = scanner.nextLine();

            System.out.print("Inserisci il nuovo stipendio del dipendente: ");
            int stipendio = scanner.nextInt();
            scanner.nextLine();

          //setto i nuovi valori passando l indice
            Dipendente d = listaDipendenti.get(indice);
            d.nome = nome;
            d.stipendio = stipendio;

            System.out.println("Dipendente aggiornato.");
        } else {
            System.out.println("Indice non valido.");
        }
    }
}

// DELETE
if(scelta == 5) {
  //controllo se la lista è vuota 
  if (listaDipendenti.isEmpty()) {
        System.out.println("La lista dei dipendenti è vuota.");
    } else {
        System.out.print("Inserisci l'indice del dipendente da cancellare: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); 

      // controllo validita indice se valido rimuovo il dipendente dalla linked
        if (indice >= 0 && indice < listaDipendenti.size()) {
          listaDipendenti.remove(indice);
          System.out.println("Dipendente eliminato! ");
        }
        else {
          System.out.println("Indice non valido! ");
        }
  }
}


}while(uscita!=6);
    

    /* 
    // creazione primo dipendente
    System.out.println("inserisci il nome del primo dipendente: ");
    String nome = scanner.nextLine();
    System.out.println("inserisci lo stipendio del primo dipendente ");
    int stipendio = scanner.nextInt();
    scanner.nextLine();
    
    // creazione secondo dipendente
    System.out.println("inserisci il nome del secondo dipendente: ");
    String nome2 = scanner.nextLine();
    System.out.println("inserisci lo stipendio del secondo dipendente ");
    int stipendio2 = scanner.nextInt();

    // aggiunta dei due dipendenti all interno della linkedlist
    listaDipendenti.add(new Dipendente(nome,stipendio));
    listaDipendenti.add(new Dipendente(nome2,stipendio2));
    
    //ciclo rapido per la stampa della linkedlist
    for(Dipendente dipendente : listaDipendenti) {
      System.out.println(dipendente);
    }
      */
    
}
}


