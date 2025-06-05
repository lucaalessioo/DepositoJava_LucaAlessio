public class Main {
    public static void main(String[] args) {
        
        boolean conPrezzo = true;

        Hotel hotel = new Hotel("Da luca");

        Suite suite1 = new Suite(102, 100);
        Suite suite2 = new Suite(203, 200);

        Camera camera1 = new Camera(10, 50);
        Camera camera2 = new Camera(40, 30);

        hotel.addCamera(camera1);
        hotel.addCamera(camera2);

        hotel.addCamera(suite1);
        hotel.addCamera(suite2);

        Hotel.contaSuite(Hotel.getListaCamere());

        suite1.dettagli();
        suite2.dettagli(conPrezzo);

        camera1.dettagli();
        camera2.dettagli(conPrezzo);

    }
    
}