import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //creazione dei due scanner
        Scanner stringa =  new Scanner(System.in);
        Scanner intero =  new Scanner(System.in);
        //inserimento di un numero con lettura e stampa
        System.out.println("inserisci un numero:");
        int numero = intero.nextInt();
        System.out.printf("questo è un numero %s%n",numero);
        //inserimento di una stringa con lettura e stampa
        System.out.println("inserisci una stringa:");
        String nome = stringa.nextLine();
        System.out.printf("questo è un numero %s%n",nome);
        //inserimento di un numero a virgola mobile con lettura e stampa
        System.out.println("inserisci un numero con virgola:");
        float numeroFloat = intero.nextFloat();
        System.out.printf("questo è un numero float %s%n",numeroFloat);
        //inserimento di un valore booleana con lettura e stampa

        System.out.println("inserisci un booleano:");
        boolean booleano = stringa.nextBoolean();
        System.out.printf("il valore booleano è %s%n",booleano);

        

    }
}

