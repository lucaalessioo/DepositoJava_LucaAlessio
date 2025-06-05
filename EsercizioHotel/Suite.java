public class Suite extends Camera {
    private String serviziExtra;

    public Suite(int numero, float prezzo) {
        super(numero, prezzo);
    }

    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    @Override
    public void dettagli() {
          System.out.println("Numero suite : "+ getNumero() + " prezzo suite : "+getPrezzo()+ " servizi extra: "+ serviziExtra);
    }

    @Override
    public void dettagli(boolean conPrezzo) {
        if(conPrezzo) {
             System.out.println("Numero suite : "+ getNumero() + " prezzo suite : "+getPrezzo());
        } else {
            System.out.println("Numero suite: "+ getNumero());
        }
    }
}
