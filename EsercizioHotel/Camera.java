public class Camera {
    private int numero;
    private float prezzo;
    public Camera(int numero, float prezzo) {
        this.numero = numero;
        this.prezzo = prezzo;
    }
    public int getNumero() {
        return numero;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    @Override
    public String toString() {
        return "Camera [numero=" + numero + ", prezzo=" + prezzo + "]";
    }

    public void dettagli() {
        System.out.println("Numero camera : "+ numero + " prezzo camera : "+prezzo);
    }

    public void dettagli(boolean conPrezzo) {
        if(conPrezzo) {
             System.out.println("Numero camera : "+ numero + " prezzo camera : "+prezzo);
        } else {
            System.out.println("Numero camera: "+ numero);
        }
    }
}
