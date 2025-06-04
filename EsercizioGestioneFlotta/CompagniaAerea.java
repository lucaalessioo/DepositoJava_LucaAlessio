import java.util.ArrayList;

public class CompagniaAerea {
    private String nome;
    private ArrayList<Aereo> flotta;
    private ArrayList<Pilota> piloti;

    // Costruttore
    public CompagniaAerea(String nome, ArrayList<Aereo> flotta, ArrayList<Pilota> piloti) {
        this.nome = nome;
        this.flotta = flotta;
        this.piloti = piloti;
    }

    // Getters Setters
    public String getNome() {
        return nome;
    }
    public ArrayList<Aereo> getFlotta() {
        return flotta;
    }
    public ArrayList<Pilota> getPiloti() {
        return piloti;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFlotta(ArrayList<Aereo> flotta) {
        this.flotta = flotta;
    }
    public void setPiloti(ArrayList<Pilota> piloti) {
        this.piloti = piloti;
    }

    // toString
    @Override
    public String toString() {
        return "CompagniaAerea [nome=" + nome + ", flotta=" + flotta + ", piloti=" + piloti + "]";
    }
    
    // Metodo per aggiungere un aereo alla flotta
    public void addAereo(Aereo aereo) {
        flotta.add(aereo);
    }

    // Metodo per aggiungere un pilota alla compagnia
    public void addPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    public void stampaDettagli() {
        // Stampa di tutti gli aerei presenti nella flotta
        System.out.println("Elenco degli aerei presenti nella flotta : ");
        System.out.println();
        for(Aereo aereo : flotta) {
            System.out.println(aereo);
        }
        // Stampa di tutti i piloti presenti in compagnia
        System.out.println();
        System.out.println("Elenco dei piloti presenti nella compagnia: ");
        System.out.println();
        for(Pilota pilota : piloti) {
            System.out.println(pilota);
        }
    }

    // Ricerca per modello dell aereo
    public ArrayList<Aereo> cercaAereiPerModello(String modello) {
    ArrayList<Aereo> risultati = new ArrayList<>();
    for (Aereo aereo : flotta) {
        if (aereo.getModello().toLowerCase().contains(modello.toLowerCase())) {
            risultati.add(aereo);
        }
    }
    if (risultati.isEmpty()) {
        System.out.println("Nessun aereo trovato. Lista vuota");
    }
    return risultati;
}

// Ricerca aerei  per numero di posti
public ArrayList<Aereo> cercaAereiPerNumeroPosti(int minimoPosti) {
    ArrayList<Aereo> risultati = new ArrayList<>();
    for (Aereo aereo : flotta) {
        if (aereo.getNumeroPosti() == minimoPosti) {
            risultati.add(aereo);
        }
    }
    if (risultati.isEmpty()) {
        System.out.println("Nessun aereo trovato. Lista vuota");
    }
    return risultati;
}


// Ricerca del pilota per nome 
public ArrayList<Pilota> cercaPilotiPerNome(String nome) {
    ArrayList<Pilota> risultati = new ArrayList<>();
    for (Pilota pilota : piloti) {
        if (pilota.getNome().toLowerCase().contains(nome.toLowerCase())) {
            risultati.add(pilota);
        }
        
    }
   if (risultati.isEmpty()) {
        System.out.println("Nessun pilota trovato. Lista vuota");
    }
    return risultati;

}

// Ricerca del pilota per ore di volo
public ArrayList<Pilota> cercaPilotiPerOreVolo(int minimoOre) {
    ArrayList<Pilota> risultati = new ArrayList<>();
    for (Pilota pilota : piloti) {
        if (pilota.getOreVolo() == minimoOre) {
            risultati.add(pilota);
        }
    }
    if (risultati.isEmpty()) {
        System.out.println("Nessun pilota trovato. Lista vuota");
    }
    return risultati;

}
}
