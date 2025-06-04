import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continua = true;
        // ciclo per creare l utente
        while (continua) {
            //  chiamo il metodo per creare l utente
            Utente utente = creaUtente();

            gestisciProfilo(utente);

            System.out.print("\nVuoi creare un altro profilo? (s/n): ");
            String risposta = scanner.nextLine();

            // se la risposta è no imposto la variabile booleana su false per uscire dal ciclo
            if (risposta.equalsIgnoreCase("n")) {
                continua = false;
            }
        }

        // chiusura del programma
        System.out.println("Arrivederci!");
        scanner.close();
    }


    // Metodo per creare utente
    private static Utente creaUtente() {
    System.out.println("\nCrea nuovo utente");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Email: ");
    String email = scanner.nextLine();

    // Chiedo ruolo con controllo su inserimento valido
    String ruolo;
    do {
        System.out.print("Ruolo (utente/chef/critico): ");
        ruolo = scanner.nextLine().toLowerCase();

        if (!ruolo.equals("utente") && !ruolo.equals("chef") && !ruolo.equals("critico")) {
            System.out.println("Ruolo non valido. Riprova.");
        }

    } while (!ruolo.equals("utente") && !ruolo.equals("chef") && !ruolo.equals("critico"));

    // Creazione oggetto in base al ruolo
    switch (ruolo) {
        case "chef":
            return new Chef(nome, email);
        case "critico":
            return new Critico(nome, email);
        default:
            return new Utente(nome, email);
    }
}

    // Metodo per la gestione del profilo utente
    private static void gestisciProfilo(Utente utente) {
        boolean interagisci = true;

        while (interagisci) {
            // Richiamo il menu con tutte le operazione che puo fare l utente
            mostraMenu();
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {

                // Stampo i dettagli dell utente
                case 1:
                    utente.stampaDettagli();
                    break;

                // Controllo se l utente è una chef e chiamo il metodo aggiungi piatto
                case 2:
                    if (utente instanceof Chef) {
                        //metodo solo dei chef
                        ((Chef) utente).aggiungiPiatto();
                    } else {
                        System.out.println("Accesso negato. Non sei uno chef.");
                    }
                    break;
                
                // Controllo se l utente è un critico e chiamo il metodo per la valutazione 
                case 3:
                    if (utente instanceof Critico) {
                        // metodo solo dei critici
                        ((Critico) utente).inserisciValutazione();
                    } else {
                        System.out.println("Accesso negato. Non sei un critico.");
                    }
                    break;
                case 4:

                // Visualizzo i piatti del ristorante
                    Ristorante.stampaPiatti();
                    break;
                case 5:
                // Visualizzo le valutazioni dei critici
                    Ristorante.stampaValutazioni();
                    break;
                case 6:
                // imposto la variabile del ciclo su false per uscire
                    interagisci = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    // Menu della gestione del ristorante
    private static void mostraMenu() {
        System.out.println("\n--- Menu Profilo ---");
        System.out.println("1. Visualizza profilo");
        System.out.println("2. Aggiungi piatto (solo chef)");
        System.out.println("3. Inserisci valutazione (solo critico)");
        System.out.println("4. Visualizza piatti");
        System.out.println("5. Visualizza valutazioni");
        System.out.println("6. Esci");
        System.out.print("Scelta: ");
    }
}