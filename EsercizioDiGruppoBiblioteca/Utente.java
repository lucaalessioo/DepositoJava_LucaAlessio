import java.util.ArrayList;

public class Utente {

    private String nome;
    private String idUtente;
    private ArrayList<Risorsa> prestiti;

    public Utente(String nome, String idUtente) {
        this.nome = nome;
        this.idUtente = idUtente;
        this.prestiti = new ArrayList<>();
    }

    // Cerca risorsa per nome
    public void cercaPerNome(ArrayList<Risorsa> catalogo, String nome) {
        boolean trovata = false;
        for (Risorsa r : catalogo) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                System.out.println(r);
                trovata = true;
            }
        }
        if (!trovata) {
            System.out.println("Nessuna risorsa trovata con nome: " + nome);
        }
    }

    // Cerca risorsa per ID
    public void cercaPerId(ArrayList<Risorsa> catalogo, int id) {
        for (Risorsa r : catalogo) {
            if (r.getId() == id) {
                System.out.println(r);
                return;
            }
        }
        System.out.println("Nessuna risorsa trovata con ID: " + id);
    }

    // Visualizza tutte le risorse di un certo tipo
    public void visualizzaPerTipo(ArrayList<Risorsa> catalogo, String tipo) {
    boolean trovata = false;

    for (Risorsa r : catalogo) {
        if (tipo.equalsIgnoreCase("libro") && r instanceof Libro) {
            r.visualizzaDettagli();
            trovata = true;
        } else if (tipo.equalsIgnoreCase("rivista") && r instanceof Rivista) {
            r.visualizzaDettagli();
            trovata = true;
        } else if (tipo.equalsIgnoreCase("ebook") && r instanceof Ebook) {
            r.visualizzaDettagli();
            trovata = true;
        }
    }

    if (!trovata) {
        System.out.println("Nessuna risorsa trovata del tipo: " + tipo);
    }
}

    // Prendi in prestito una risorsa se disponibile per id
    public void prendiInPrestito(ArrayList<Risorsa> catalogo, int id) {
        for (Risorsa r : catalogo) {
            if (r.getId() == id) {
                if (r.isDisponibile()) {
                    r.setDisponibile(false);
                    prestiti.add(r);
                    System.out.println("Hai preso in prestito: " + r.getNome());
                } else {
                    System.out.println("Risorsa non disponibile.");
                }
                return;
            }
        }
        System.out.println("Risorsa con ID " + id + " non trovata.");
    }

  // Restituisci una risorsa
  public void restituisci(int id) {
    for (int i = 0; i < prestiti.size(); i++) {
        Risorsa r = prestiti.get(i);               // mi faccio dare ogni ciclo la risorsa corrente
        if (r.getId() == id) {                     // controllo se l id combacia e se combacia imposto su true la disponibilita della risorsa che è stata depositata
            r.setDisponibile(true);
            prestiti.remove(i);                         // Rimuove l'elemento dalla lista
            System.out.println("Hai restituito: " + r.getNome());
            return;
        }
    }
    System.out.println("Risorsa non presente nella tua lista.");
}

    
    public void logout() {
        System.out.println("Utente " + nome +" ha effettuato il logout.");
    }

    public String getNome() {
        return nome;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public ArrayList<Risorsa> getPrestiti() {
        return prestiti;
    }
}