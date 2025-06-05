public class Rivista extends Risorsa {
    private int numero;

    public Rivista(int id, String nome, int numero) {
        super(id, nome);
        this.numero = numero;
    }

    // prendo il toString della classe padre e gli aggiungo il numero della rivista
    @Override
    public void visualizzaDettagli() {
        System.out.println(super.toString() + " - Numero: " + numero);
    }
}
