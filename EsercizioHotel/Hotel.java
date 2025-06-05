import java.util.ArrayList;

public class Hotel {
    private String nome;
    private static ArrayList<Camera> listaCamere = new ArrayList<>();

    public Hotel(String nome) {
        this.nome = nome;
        
    }

    public  void addCamera(Camera camera) {
        listaCamere.add(camera);
    }
    
    public static void contaSuite(ArrayList<Camera> lista) {
        int contatore = 0;
        
        for(Camera camera : lista) {
            if(camera instanceof Suite) {
            System.out.println(camera);
            contatore++;
            }
        }
        System.out.println("Numero suite: "+ contatore);
    }

    public static ArrayList<Camera> getListaCamere() {
          return listaCamere;
}
}
