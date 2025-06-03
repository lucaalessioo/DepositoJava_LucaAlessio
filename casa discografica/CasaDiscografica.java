import java.util.ArrayList;

class CasaDiscografica {
    String nome;
    ArrayList<Album> listaAlbum;  // Lista composta da album

    // Costruttore
    public CasaDiscografica(String nome) {
        this.nome = nome;
        this.listaAlbum = new ArrayList<>();
    }

    // Metodo per aggiungere un album nella lista
    public void aggiungiAlbum(Album album) {
        listaAlbum.add(album);
        System.out.println("Album aggiunto: " + album.titolo);
    }

    // Metodo per stampare ogni album all interno della lista
    public void stampaTuttiAlbum() {
        System.out.println("\nCasa Discografica: " + nome);

    // Se è vuota esco
        if(listaAlbum.isEmpty()) {
            System.out.println("Nessun album disponibile.");
            return;
        }
    // Stampo tutte le info di ogni album presente nella lista
        for(Album a : listaAlbum) {
            a.stampaInfo();
            System.out.println("-------------------");
        }
    }
}
