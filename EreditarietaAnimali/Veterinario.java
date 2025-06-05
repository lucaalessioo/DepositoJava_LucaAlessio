import java.util.Scanner;

public class Veterinario {
    public void curaAnimale(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome dell'animale da curare: ");
        String nome = scanner.nextLine();

        Animale animale = zoo.trovaAnimalePerNome(nome);
        if (animale != null) {
            if (animale.isMalato()) {
                animale.cura();
                System.out.println(nome + " è stato curato!");
            } else {
                System.out.println(nome + " non è malato.");
            }
        } else {
            System.out.println("Animale non trovato.");
        }
    }
}
