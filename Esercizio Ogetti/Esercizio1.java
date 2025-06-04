import java.util.Scanner;

public class Esercizio1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        Officina officina = new Officina();

        // Ciclo infinito per il menu dell officina
        while (true) {
            System.out.println("\n MENU OFFICINA");
            System.out.println("1. Aggiungi auto");
            System.out.println("2. Mostra tutte le auto");
            System.out.println("3. Cancella auto");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            // Controllo per ogni tipo di scelta
            switch (scelta) {

                // Aggiunta di un auto
                case 1:
                    System.out.print("Inserisci nome proprietario: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci cognome proprietario: ");
                    String cognome = scanner.nextLine();
                    Utente utente = new Utente(nome, cognome);

                    System.out.print("Inserisci targa: ");
                    String targa = scanner.nextLine();
                    System.out.print("Inserisci marca: ");
                    String marca = scanner.nextLine();

                    Auto auto = new Auto(targa, marca, utente);
                    officina.addAuto(auto);
                    System.out.println("\nAuto aggiunta con successo!");
                    break;

                // Stampa di tutte le auto presenti nella lista
                case 2:
                 if(officina.listaAuto.isEmpty()) {
                        System.out.println("Lista auto vuota");
                        break;
                    }
                    officina.stampaAuto();
                    break;
                
                // Cancellazione di un auto
                case 3:
                    if(officina.listaAuto.isEmpty()) {
                        System.out.println("Lista auto vuota");
                        break;
                    }
                    System.out.print("Inserisci la targa dell'auto da cancellare: ");
                    String targaDaCancellare = scanner.nextLine();
                    officina.rimuoviAuto(targaDaCancellare);
                    break;
                
                // Uscita dal programma
                case 4:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;

                // Caso di defoult che parte se non ha trovato nessun case
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
}
}
