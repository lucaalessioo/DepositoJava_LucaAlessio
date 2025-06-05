public class Gatto extends Animale {

    public Gatto(String nome, int eta, boolean malato) {
        super(nome, eta, malato);
    }
    
    @Override
    public void faiVerso() {
        System.out.println("Miao!");
    }
    public void stampaDettagli() {
       System.out.println("Nome: "+getNome()+ "Eta: "+getEta());
    }
}
