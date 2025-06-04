import java.util.ArrayList;

public class Ristorante {

    protected static ArrayList<String> piatti = new ArrayList<>();
    protected static ArrayList<String> valutazioni = new ArrayList<>();

    public static void stampaPiatti() {
        if (piatti.isEmpty()) {
            System.out.println("Nessun piatto disponibile.");
        } else {
            System.out.println("Piatti disponibili:");
            for (String piatto : piatti) {
                System.out.println("- " + piatto);
            }
        }
    }

    public static void stampaValutazioni() {
        if (valutazioni.isEmpty()) {
            System.out.println("Nessuna valutazione disponibile.");
        } else {
            System.out.println("Valutazioni:");
            for (String val : valutazioni) {
                System.out.println("- " + val);
            }
        }
    }
}