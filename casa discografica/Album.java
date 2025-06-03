class Album {
    String titolo;
    String dataPubblicazione;
    Artista artista;   // Ogetto della classe artista

    // Costruttore
    public Album(String titolo, String dataPubblicazione, Artista artista) {
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.artista = artista;
    }

    // Metodo per stampare le informazioni dell album
    public void stampaInfo() {
        System.out.println("Album: " + titolo + ", Data: " + dataPubblicazione);
        artista.stampaInfo();
    }
}
