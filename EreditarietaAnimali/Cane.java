public class Cane extends Animale {


    public Cane(String nome, int eta , boolean malato) {
        super(nome, eta, malato);
        
    }

    @Override
    public void faiVerso() {
        System.out.println("Bau!");
    }

    public void stampaDettagli() {
       System.out.println("Nome: "+getNome()+ "Eta: "+getEta());
    }
    
}
