import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creazione di aerei
        Aereo aereo = new Aereo("F15", 100);
        Aereo aereo2 = new Aereo("JET", 10 );

        // Creazione dei piloti
        Pilota pilota = new Pilota("marco", "10", 100);
        Pilota pilota2 = new Pilota("federico", "10", 100);

        // Assegnazione ogetti alla lista aerei
        ArrayList<Aereo> listaAereo = new ArrayList<>();
        listaAereo.add(aereo); 
        listaAereo.add(aereo2); 

        // Assegnazione oggetti alla lista piloti
        ArrayList<Pilota> listaPiloti = new ArrayList<>();
        listaPiloti.add(pilota); 
        listaPiloti.add(pilota2); 

        // Creazione della compagnia
        CompagniaAerea compagnia = new CompagniaAerea("Alitalia", listaAereo, listaPiloti);

        // Stampa dei dettagli
        compagnia.stampaDettagli();
        System.out.println();

        // Prova dei tipi di ricerca sugli aerei
        ArrayList<Aereo> lista = compagnia.cercaAereiPerModello("F15");
        for(Aereo a : lista) {
            System.out.println(a);
        }

        // Prova dei tipi di ricerca dei piloti
        ArrayList<Pilota> lista2 = compagnia.cercaPilotiPerNome("marcoo");
        for(Pilota p : lista2) {
            System.out.println(p);
        }
    }
}
