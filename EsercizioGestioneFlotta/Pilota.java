public class Pilota {

    // Variabili
    private String nome;
    private String numeroBrevetto;
    private int oreVolo;

    // Costruttore
    public Pilota(String nome, String numeroBrevetto, int oreVolo) {
        this.nome = nome;
        this.numeroBrevetto = numeroBrevetto;
        this.oreVolo = oreVolo;
    }
    public String getNome() {
        return nome;
    }
    public String getNumeroBrevetto() {
        return numeroBrevetto;
    }
    public int getOreVolo() {
        return oreVolo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroBrevetto(String numeroBrevetto) {
        this.numeroBrevetto = numeroBrevetto;
    }
    public void setOreVolo(int oreVolo) {
        if(oreVolo > 0) {
        this.oreVolo = oreVolo;
        }else {
            System.out.println("Errore. ore di volo inferiori a 0");
        }
    }
    @Override
    public String toString() {
        return "Pilota [nome=" + nome + ", numeroBrevetto=" + numeroBrevetto + ", oreVolo=" + oreVolo + "]";
    }

    
}
