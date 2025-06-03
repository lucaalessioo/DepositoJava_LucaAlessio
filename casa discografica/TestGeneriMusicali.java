import java.util.Scanner;

public class TestGeneriMusicali {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Inserisco il nome della casa discografica
        System.out.print("Inserisci il nome della casa discografica: ");
        String nomeCasa = scanner.nextLine();

        // Creo l oggetto casadiscografica
        CasaDiscografica casa = new CasaDiscografica(nomeCasa);

        // Ciclo infinito per il menu
        while(true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Aggiungi album");
            System.out.println("2. Visualizza tutti gli album");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            // Inserimento dell album
            if(scelta == 1) {
                System.out.print("Inserisci il titolo dell'album: ");
                String titolo = scanner.nextLine();

                System.out.print("Inserisci la data di pubblicazione (es. 2024-06-01): ");
                String data = scanner.nextLine();

                System.out.print("Inserisci il nome dell'artista: ");
                String nomeArtista = scanner.nextLine();

                System.out.print("Inserisci il genere musicale dell'artista: ");
                String genere = scanner.nextLine();

                // Creo oggetto artista da passare poi nell ogetto album
                Artista artista = new Artista(nomeArtista, genere);
                Album album = new Album(titolo, data, artista);

                // aggiungo l album nella lista della casa discografica
                casa.aggiungiAlbum(album);
            } 

            // Stampo i libri all interno della casa discografica
            else if(scelta == 2) {
                casa.stampaTuttiAlbum();
            } 

            // Esco dal programma
            else if(scelta == 3) {
                System.out.println("Arrivederci! ");
                break;
            } 
            else {
                System.out.println("Opzione non valida, riprova.");
            }
        }

        scanner.close();
    }
}
