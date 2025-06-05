import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione risorse iniziali
        ArrayList<Risorsa> catalogo = new ArrayList<>();
        catalogo.add(new Libro(1, "Il Signore degli Anelli", "Tolkien"));
        catalogo.add(new Rivista(2, "Focus", 123));
        catalogo.add(new Ebook(3, "Clean Code", "PDF"));

        
        Utente utente = null; 

        // Simulazione menù
        while (true) {
            System.out.println("\n=== BIBLIOTECA ===");
            System.out.println("1. Accedi come Utente");
            System.out.println("2. Accedi come Bibliotecario");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            int sceltaRuolo = Integer.parseInt(scanner.nextLine());

            if (sceltaRuolo == 0) {
                System.out.println("Uscita");
                break;
            }

            switch (sceltaRuolo) {
                case 1:
                        if (utente == null) {
                        System.out.print("Inserisci il tuo nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Inserisci il tuo ID utente: ");
                        String id = scanner.nextLine();
                        utente = new Utente(nome, id);
                        System.out.println("Utente creato correttamente!\n");
                        menuUtente(scanner, utente, catalogo);
                        }
                    break;
                case 2:
                    menuBibliotecario(scanner, catalogo); // da completare dennis
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }

    public static void menuUtente(Scanner scanner, Utente utente, ArrayList<Risorsa> catalogo) {
        while (true) {
            System.out.println("\n--- Menu Utente ---");
            System.out.println("1. Visualizza tutte le risorse");
            System.out.println("2. Visualizza risorse per tipo");
            System.out.println("3. Prendi in prestito");
            System.out.println("4. Restituisci");
            System.out.println("5. Logout");
            System.out.print("Scelta: ");
            int scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 1:
                    for (Risorsa r : catalogo) {
                        r.visualizzaDettagli();
                    }
                    break;
                case 2:
                    System.out.print("Che tipo? (libro, rivista, ebook): ");
                    String tipo = scanner.nextLine().toLowerCase();
                    utente.visualizzaPerTipo(catalogo,tipo); 
                    break;
                case 3:
                    System.out.print("Inserisci ID risorsa da prendere: ");
                    int idPrestito = Integer.parseInt(scanner.nextLine());
                    utente.prendiInPrestito(catalogo, idPrestito);
                    break;
                case 4:
                    System.out.print("Inserisci ID risorsa da restituire: ");
                    int idRest = Integer.parseInt(scanner.nextLine());
                    utente.restituisci(idRest);
                    break;
                case 5:
                    System.out.println("Logout utente");
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    public static void menuBibliotecario(Scanner scanner, ArrayList<Risorsa> catalogo) {
        while (true) {
            System.out.println("\n--- Menu Bibliotecario ---");
            System.out.println("1. Visualizza catalogo");
            System.out.println("2. Aggiungi risorsa"); // da implementare nella classe Bibliotecario
            System.out.println("3. Rimuovi risorsa");
            System.out.println("4. Visualizza prestiti utenti");
            System.out.println("5. Logout");
            System.out.print("Scelta: ");
            int scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 1:
                    for (Risorsa r : catalogo) {
                        r.visualizzaDettagli();
                    }
                    break;
                case 2:
                    System.out.println("Da implementare nella classe Bibliotecario.");
                    break;
                case 3:
                    System.out.println("Da implementare nella classe Bibliotecario.");
                    break;
                case 4:
                    System.out.println(" Da implementare: serve accesso agli utenti.");
                    break;
                case 5:
                    System.out.println("Logout bibliotecario...");
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
