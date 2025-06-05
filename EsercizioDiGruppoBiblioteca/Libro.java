public class Libro extends Risorsa {
    private String autore;

    public Libro(int id, String nome, String autore) {
        super(id, nome);
        this.autore = autore;
    }


    // Prendo il toString della classe padre e ci aggiungo l autore
    @Override
    public void visualizzaDettagli() {
        System.out.println(super.toString() + " - Autore: " + autore);
    }
}
