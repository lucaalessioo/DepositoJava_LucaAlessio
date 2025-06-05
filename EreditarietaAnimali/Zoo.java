import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Cane> cani = new ArrayList<>();
    private ArrayList<Gatto> gatti = new ArrayList<>();
    private ArrayList<Leone> leoni = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void avvia() {
        boolean continua = true;
        Veterinario vet = new Veterinario();
        Zookeeper keeper = new Zookeeper();

        while (continua) {
            System.out.println("\n--- MENU ZOO ---");
            System.out.println("1. Aggiungi animale");
            System.out.println("2. Stampa tutti gli animali");
            System.out.println("3. Stampa animali per tipo");
            System.out.println("4. Veterinario - Cura animale");
            System.out.println("5. Zookeeper - Aggiungi animale");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            switch (scelta) {
                case 1 -> aggiungiAnimaleDaInput();
                case 2 -> stampaTutti();
                case 3 -> stampaPerTipo();
                case 4 -> vet.curaAnimale(this);
                case 5 -> keeper.aggiungiAnimale(this);
                case 6 -> {
                    continua = false;
                    System.out.println("Uscita...");
                }
                default -> System.out.println("Scelta non valida.");
            }
        }
    }

    public void aggiungiAnimaleDaInput() {
        System.out.print("Tipo di animale (cane/gatto/leone): ");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Età: ");
        int eta = scanner.nextInt();
        System.out.print("È malato? (true/false): ");
        boolean malato = scanner.nextBoolean();
        scanner.nextLine(); 

        switch (tipo) {
            case "cane" -> cani.add(new Cane(nome, eta, malato));
            case "gatto" -> gatti.add(new Gatto(nome, eta, malato));
            case "leone" -> leoni.add(new Leone(nome, eta, malato));
            default -> System.out.println("Tipo sconosciuto.");
        }
    }

    public void stampaTutti() {
        System.out.println("\n--- Cani ---");
        for (Cane c : cani) {
            c.stampaDettagli();
            c.faiVerso();
            System.out.println("---");
        }

        System.out.println("\n--- Gatti ---");
        for (Gatto g : gatti) {
            g.stampaDettagli();
            g.faiVerso();
            System.out.println("---");
        }

        System.out.println("\n--- Leoni ---");
        for (Leone l : leoni) {
            l.stampaDettagli();
            l.faiVerso();
            System.out.println("---");
        }
    }

    public void stampaPerTipo() {
        System.out.print("Quale tipo vuoi stampare? (cane/gatto/leone): ");
        String tipo = scanner.nextLine().toLowerCase();

        switch (tipo) {
            case "cane" -> cani.forEach(c -> { c.stampaDettagli(); c.faiVerso(); System.out.println("---"); });
            case "gatto" -> gatti.forEach(g -> { g.stampaDettagli(); g.faiVerso(); System.out.println("---"); });
            case "leone" -> leoni.forEach(l -> { l.stampaDettagli(); l.faiVerso(); System.out.println("---"); });
            default -> System.out.println("Tipo non valido.");
        }
    }

    public Animale trovaAnimalePerNome(String nome) {
        for (Cane c : cani) if (c.getNome().equalsIgnoreCase(nome)) return c;
        for (Gatto g : gatti) if (g.getNome().equalsIgnoreCase(nome)) return g;
        for (Leone l : leoni) if (l.getNome().equalsIgnoreCase(nome)) return l;
        return null;
    }
}

