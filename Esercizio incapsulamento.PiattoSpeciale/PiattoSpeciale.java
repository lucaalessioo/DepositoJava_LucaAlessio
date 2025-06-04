import java.util.ArrayList;
import java.util.HashMap;

public class PiattoSpeciale {
    // variabile per la base di fisso 
    private static final double PREZZO_BASE = 1.0;

    // creazione di una mappa per i panini che ha per chiave il nome e per valore il prezzo
    public static final HashMap<String, Double> paniniDisponibili = new HashMap<>();
    // creazione di una mappa per tutti gli ingredienti composta da nome e prezzo
    private static final HashMap<String, Double> ingredientiPrivatiDisponibili = new HashMap<>();

    // variabile del panino 
    private String paninoScelto;
    // arraylist per raggruppare tutti gli ingredienti scelti
    private ArrayList<String> ingredientiPrivatiScelti;

    //  blocco statico per inserire i valori nelle mappe statiche
    static {
        // Panini pubblici
        paniniDisponibili.put("normale", 0.5);
        paniniDisponibili.put("sesamo", 1.0);
        paniniDisponibili.put("integrale", 0.8);

        // Ingredienti privati
        ingredientiPrivatiDisponibili.put("ketchup", 0.3);
        ingredientiPrivatiDisponibili.put("maionese", 0.4);
        ingredientiPrivatiDisponibili.put("formaggio", 1.2);
        ingredientiPrivatiDisponibili.put("bacon", 1.5);
    }

    // costruttore per creare il piatto con i rispettivi ingredienti
    public PiattoSpeciale(String paninoScelto, ArrayList<String> ingredientiPrivatiScelti) {
        this.paninoScelto = paninoScelto;
        this.ingredientiPrivatiScelti = ingredientiPrivatiScelti;
    }


   // metodo per calcolare il prezzo del piatto
   public double calcolaPrezzoTotale() {
        // il totale parte dal prezzo base dichiarato all inizio
        double totale = PREZZO_BASE;

        // controllo se all interno della mappa dei panini disponibili ci sta il panino scelto passato al costruttore 
        if (paniniDisponibili.containsKey(paninoScelto)) {
            // tramite il metodo get mi prendo il valore del paninoscelto e lo sommo al prezzo 
            totale += paniniDisponibili.get(paninoScelto);
        }

        // ciclo gli ingredienti se all interno della lista degli ingredienti trovo gli ingredienti privati scelti allora sommo il loro costo al totale
        for (String ingr : ingredientiPrivatiScelti) {
            if (ingredientiPrivatiDisponibili.containsKey(ingr)) {
                totale += ingredientiPrivatiDisponibili.get(ingr);
            }
        }

        return totale;
    }
    // metodo per vedere tutti gli ingredienti privati disponibili
    public static void mostraIngredientiPrivati() {
        System.out.println("Ingredienti privati disponibili:");

        // ciclo tutto il set di ingredienti e stampo il nome ed il suo costo
        for (String ingr : ingredientiPrivatiDisponibili.keySet()) {
            System.out.println("- " + ingr + " (euro" + ingredientiPrivatiDisponibili.get(ingr) + ")");
        }
    }


    public static boolean isIngredientePrivatoValido(String ingrediente) {
        return ingredientiPrivatiDisponibili.containsKey(ingrediente.toLowerCase());
    }
}
