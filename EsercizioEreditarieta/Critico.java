import java.util.Scanner;

public class Critico extends Utente{

     Scanner scanner = new Scanner(System.in);    
     public Critico(String nome, String email) {
        super(nome, email);
    }

    public void inserisciValutazione() {
        System.out.print("Scrivi la tua valutazione: ");
        String valutazione = scanner.nextLine();
        Ristorante.valutazioni.add(valutazione);
        System.out.println("Valutazione inserita con successo!");
    }
}
