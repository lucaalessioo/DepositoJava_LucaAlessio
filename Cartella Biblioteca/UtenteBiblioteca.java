
import java.util.ArrayList;

public class UtenteBiblioteca {
    
    String username;
    String password;
    ArrayList<Book> libriPresi;


    UtenteBiblioteca(String username , String password) {
        this.username = username;
        this.password = password;
        
        this.libriPresi = new ArrayList<>();
    }

     public void mostraLibriPresi() {
        if (libriPresi.isEmpty()) {
            System.out.println(username + " non ha preso in prestito nessun libro.");
        } else {
            System.out.println("Libri presi da " + username + ":");
            for (Book b : libriPresi) {
                System.out.println("- " + b.titolo);
            }
        }
}
}
