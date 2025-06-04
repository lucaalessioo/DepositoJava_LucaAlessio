import java.util.ArrayList;

public class Officina {
    //Array list di Auto
    ArrayList<Auto> listaAuto;

    // Costruttore che inizializza l arraylist
    Officina() {
        this.listaAuto = new ArrayList<>();
    }

    // Metodo per aggiungere un auto alla lista
    public void addAuto(Auto auto) {
        listaAuto.add(auto);
    }

    // Metodo per stampare tutte le auto
    public void stampaAuto() {
        for(Auto auto: listaAuto) {
            System.out.println(auto);
        }
    }

    // Metodo per rimuovere un auto
    public void rimuoviAuto(String targa) {

    boolean trovata = false;

    // Ciclo la lista delle auto e ad ogni ciclo mi prendo una auto alla volta
    for (int i = 0; i < listaAuto.size(); i++) {
        Auto auto = listaAuto.get(i);

        // Confronto la targa dell auto con la targa inserita
        if (auto.targa.equalsIgnoreCase(targa)) {

            // Se la targa coincide, elimino l auto e imposto la variabile booleana su true
            listaAuto.remove(i);
            trovata = true;
            System.out.println("Auto rimossa con successo.");
            break;
        }
    }

    // Se la variabile è su false, vuol dire che non ha trovato la corrispondenza con la targa 
    if (!trovata) {
        System.out.println("Auto non trovata.");
    }
}
}
