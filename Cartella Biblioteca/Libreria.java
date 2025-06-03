import java.util.ArrayList;

public class Libreria {
    ArrayList<Book> listaLibri ;

    // Costruttore
    Libreria() {
        listaLibri = new ArrayList<>();
    }

    // aggiunge un libro
    public void aggiungiLibro(Book libro) {
        listaLibri.add(libro);
    }

    public void mostraTuttiLibri() {
        for(Book libro : listaLibri) {
            libro.mostraLibro();
        }
    }

    public Book cercaLibro(String titolo) {
        for (Book libro : listaLibri) {
            if (libro.titolo.equalsIgnoreCase(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean prendiInPrestito(UtenteBiblioteca utente ,String titolo) {
        Book libro = cercaLibro(titolo);
        if (libro == null) {
            System.out.println("Libro non trovato.");
            return false;
    }
    if (!libro.disponibilitaLibro) {
            System.out.println("Libro non disponibile.");
            return false;
        }

        libro.disponibilitaLibro = false;
        utente.libriPresi.add(libro);
        System.out.println(utente.username + " ha preso in prestito: " + titolo);
        return true;
    }

    
}
