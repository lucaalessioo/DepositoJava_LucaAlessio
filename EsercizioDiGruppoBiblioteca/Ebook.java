public class Ebook extends Risorsa {
    private String formato; // Es: PDF, EPUB, MOBI

    public Ebook(int id, String nome, String formato) {
        super(id, nome);
        this.formato = formato;
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println(super.toString() + " - Formato: " + formato);
    }
}
