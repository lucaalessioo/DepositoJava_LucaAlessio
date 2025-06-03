import java.util.ArrayList;
import java.util.Scanner;



public class Biblioteca {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        ArrayList<UtenteBiblioteca> listaUtenti = new ArrayList<>();
        
        
        int condizione=0;
        System.out.println("Benvenuto della biblioteca! ");
        do {
            System.out.println("Digita 1. Accedi\n Digita 2. Registrati\n Digita 3. Esci");
            int scelta = scanner.nextInt();
            condizione = scelta;
            

            if(scelta == 1) {
                System.out.print("Inserisci username: ");
                String username = scanner.nextLine();
                System.out.print("Inserisci password: ");
                String password = scanner.nextLine();
        
        // inizializzo a null una variabile di tipo UtenteBiblioteca da usare nel controllo dopo
                UtenteBiblioteca utenteTrovato = null;
                for (UtenteBiblioteca u : listaUtenti) {
        // se le credenziali sono corrette allora imposto la variabile creata prima con la variabile all interno del for e stoppo la ricerca dell utente
                    if (u.username.equals(username) && u.password.equals(password)) {
                        utenteTrovato = u;
                        break;
                    }
                }
        
        // se l utente trovatrovato non è null allora i login è andato a buon fine quindi apro il menu delle operazioni da fare nella biblioteca
                if (utenteTrovato != null) {
                    System.out.println("Accesso riuscito. Benvenuto, " + utenteTrovato.username + "!");
                    menuBiblioteca(scanner,libreria,utenteTrovato);
                    
                } else {
                    System.out.println("Credenziali errate.");
                }

       
            }
            }while(condizione != 3);  // uscita dal ciclo principale
        }
    
                
            //Menu azioni biblioteca
            public static void menuBiblioteca(Scanner scanner ,Libreria libreria,UtenteBiblioteca utente) {
            Scanner s = new Scanner(System.in);
            while (true) {
            System.out.println("\nMENU BIBLIOTECA");
            System.out.println("1. AGGIUNGI LIBRO");
            System.out.println("2. MOSTRATUTTI I LIBRI");
            System.out.println("3. PRENDI IN PRESTITO UN LIBRO");
            System.out.println("4. ESCI");
            System.out.print("Scegli: ");
            int scelta = s.nextInt();

            if(scelta == 1) {
                System.out.println("Inserisci il titolo del libro: ");
                String titolo = scanner.nextLine();
                System.out.println("Inserisci il nome dell autore: ");
                String autore = scanner.nextLine();
                libreria.aggiungiLibro(new Book(titolo, autore, true));
                System.out.println("Libro aggiunto");
            }

            if(scelta == 2) {
                libreria.mostraTuttiLibri();
            }

            if(scelta == 3) {
                System.out.println("Inserisci il titolo del libro che vuoi prendere in prestito: ");
                String titolo = s.nextLine();
                libreria.prendiInPrestito(utente, titolo);
            }
            if(scelta == 4) {
                System.out.println("Arrivederci !!");
                break;
            }

        }
    }
}
        
