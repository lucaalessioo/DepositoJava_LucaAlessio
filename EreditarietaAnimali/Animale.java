public class Animale {
    private String nome;
    private int eta;
    private boolean malato = false;
    

    public Animale(String nome, int eta, boolean malato) {
        this.nome = nome;
        this.eta = eta;
        this.malato = malato;
    }


    public String getNome() {
        return nome;
    }


    public int getEta() {
        return eta;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isMalato() {
        return malato;
    }

    public void cura() {
        this.malato = false;
    }

    @Override
    public String toString() {
        return "Animale [nome=" + nome + ", eta=" + eta + "status : "+malato + "]" ;
    }


    public void faiVerso() {
        System.out.println("Verso Generico!");
    }
}