import java.util.Scanner;                          //import classe scanner

public class ProvaScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);    //creazione dell oggetto scanner myObj
        System.out.println("Enter username");      // println

        String userName = myObj.nextLine();              //read user input  
        System.out.printf("User name:%s ",userName); //printf
        

    


    }
}
