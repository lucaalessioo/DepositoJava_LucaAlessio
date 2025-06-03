public class Book {
    String titolo;
    String autore;
    boolean disponibilitaLibro = true;

    // Costruttore
    Book(String titolo , String autore , boolean disponibilitaLibro) {
        this.titolo = titolo;
        this.autore = autore;
        this.disponibilitaLibro = disponibilitaLibro;
    }
    public void mostraLibro() {
        System.out.println("Titolo : "+ titolo+ "autore : "+ autore+ "disponibilita libro: "+ disponibilitaLibro);
    }

    @Override
    public String toString() {
        return "Book [titolo=" + titolo + ", autore=" + autore + ", disponibilitaLibro=" + disponibilitaLibro + "]";
    }
    
}
