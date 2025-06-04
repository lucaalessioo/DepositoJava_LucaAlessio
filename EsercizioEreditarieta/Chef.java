import java.util.Scanner;

public class Chef extends Utente {

    Scanner scanner = new Scanner(System.in);

    public Chef(String nome, String email) {
        super(nome, email);
    }

    public void aggiungiPiatto() {

        System.out.print("Inserisci il nome del nuovo piatto: ");
        String piatto = scanner.nextLine();
        Ristorante.piatti.add(piatto);
        System.out.println("Piatto aggiunto con successo!");
        
    }

}
