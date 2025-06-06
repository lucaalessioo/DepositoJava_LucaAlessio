import java.util.Scanner;

public class EsercizioGeneraleFunzioni {
    public static void main(String[] args) {
        // Creo lo scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Benvenuto nel menu dell'esercizio\n");

        // Ciclo infinito per il menu
        while (true) {
            System.out.println("Digita 1. Funzione base");
            System.out.println("Digita 2. Funzione ricorsiva");
            System.out.println("Digita 3. Funzione passaggio per valore e per riferimento");
            System.out.println("Digita 4. Esci");

            int scelta = scanner.nextInt();

            // Funzione base
            if (scelta == 1) {
                System.out.println("Funzione per il calcolo della somma di due numeri.");
                System.out.println("Inserisci il primo numero ");
                int numero1 = scanner.nextInt();
                System.out.println("Inserisci il secondo numero ");
                int numero2 = scanner.nextInt();

                int risultato = funzioneBase(numero1, numero2);
                System.out.println("Il risultato finale è: " + risultato);
                System.out.println();
            }

            // Funzione ricorsiva
            if (scelta == 2) {
                System.out.println("Inserisci il numero da sommare: ");
                int n = scanner.nextInt();
                int risultato = funzioneRicorsiva(n);
                System.out.println("Il risultato è: " + risultato);
                System.out.println();
            }

            // Passaggio per valore o riferimento
            if (scelta == 3) {
                System.out.println("Digita 1. Modifica per valore, Digita 2. Modifica per riferimento");
                int valore = scanner.nextInt();
            
            // Per Valore
                if (valore == 1) {
                    System.out.println("Inserisci un numero");
                    int n = scanner.nextInt();
                    System.out.println(passaggioPerValore(n));
                }
            
            // Per Riferimento
                if (valore == 2) {
                    
            // Creazione dell' array con ciclo per la stampa 
                    int[] array = {1, 2};
                    System.out.println("Prima");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
            // Richiamo della funzione con ciclo per la stampa
                    array = passaggioPerRiferimento(array);
                    System.out.println("Dopo");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                }
            }

            // Uscita
            if (scelta == 4) {
                System.out.println("Arrivederci!");
                scanner.close();
                return;
            }
        }
    }

    // Funzione base
    public static int funzioneBase(int a, int b) {
        return a + b;
    }

    // Funzione ricorsiva per calcolare la somma
    public static int funzioneRicorsiva(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + funzioneRicorsiva(n - 1);
        }
    }

    // Passaggio per valore 
    public static int passaggioPerValore(int n) {
        return n = n * 10;
    }

    // Passaggio per riferimento
    public static int[] passaggioPerRiferimento(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * 10;
        }
        return n;
    }
}