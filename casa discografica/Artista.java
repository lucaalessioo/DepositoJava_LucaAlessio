class Artista {
    String nome;
    String genereMusicale;

    // Costruttore
    public Artista(String nome, String genereMusicale) {
        this.nome = nome;
        this.genereMusicale = genereMusicale;
    }
    
    // Metodo per stampare le info sull artista
    public void stampaInfo() {
        System.out.println("Artista: " + nome + ", Genere: " + genereMusicale);
    }
}
