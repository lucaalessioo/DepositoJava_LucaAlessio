import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU PIATTO SPECIALE");
            System.out.println("Scegli il tipo di panino:");
            // mi creo un indice da passare poi alla stampa 
            int i = 1;

            // mi faccio dare tramite keyset la il set di panini disponibili
            ArrayList<String> listaPanini = new ArrayList<>(PiattoSpeciale.paniniDisponibili.keySet());

            // visualizzo sul menu tutti i tipi di panini disponibili e con il get mi vado a far dare il prezzo
            for (String panino : listaPanini) {
                System.out.println(i + ". " + panino + " (euro " + PiattoSpeciale.paniniDisponibili.get(panino) + ")");
                i++;
            }

            // scelgo il tipo di pane
            System.out.print("Inserisci numero panino: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            // controllo che il valore inserito è corretto se sbaglia inserimento utilizzo continue per interrompere il flusso e ripartire dal menu
            if (scelta < 1 || scelta > listaPanini.size()) {
                System.out.println("Scelta non valida. Ritorno al menu.");
                continue;
            }

            // mi salvo su variabile il panino scelto dall utente, essendo indicizzato da 0 l araylist passo la scelta meno 1 senno avro un indexofbounds
            String paninoScelto = listaPanini.get(scelta - 1);

            // Apro il menu di tutti gli ingredienti privati
            PiattoSpeciale.mostraIngredientiPrivati();
            ArrayList<String> privatiScelti = new ArrayList<>();

            // inserimento degli ingredienti
            System.out.println("Inserisci ingredienti privati (digita 'fine' per terminare):");
            while (true) {
                System.out.print("Ingrediente: ");
                String ingr = scanner.nextLine().toLowerCase();

                //uscita dal ciclo nel caso si scriva fine
                if (ingr.equals("fine")) 
                break;

                // se il controllo del metodo isIngredientePrivatoValido restituisce true aggiungo l ingrediente
                if (PiattoSpeciale.isIngredientePrivatoValido(ingr)) {
                    privatiScelti.add(ingr);
                } else {
                    //altrimenti messaggio di errore
                    System.out.println("Ingrediente non valido.");
                }
            }

            // cro piatto e calcolo prezzo
            PiattoSpeciale piatto = new PiattoSpeciale(paninoScelto, privatiScelti);
            double totale = piatto.calcolaPrezzoTotale();

            System.out.println("Totale: euro " + totale);
            System.out.println("----------- Buon Appetito -----------");
        }

  }
}