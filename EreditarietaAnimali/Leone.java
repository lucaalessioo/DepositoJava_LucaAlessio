public class Leone extends Animale{
    public Leone(String nome, int eta, boolean malato) {
        super(nome, eta, malato);
    }

    @Override
    public void faiVerso() {
        System.out.println(" grrr !");
    }
    public void stampaDettagli() {
       System.out.println("Nome: "+getNome()+ "Eta: "+getEta());
    }
}
