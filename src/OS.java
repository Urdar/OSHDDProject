import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jarlè on 10.04.2015.
 */
public class OS {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String funksjon;
    Driver driver;

    public static void main(String[] args) throws IOException {
        OS runOS = new OS();

    }

    public OS() throws IOException {

        driver = new Driver();

        while(true) {
            System.out.println("Skriv funksjon + det du vil, eks 'write', 'read' eller 'seek'");
            funksjon = input.readLine();
            String searchFor;

            if (funksjon.equals("write")) {
                System.out.println("\nTakk, skriv så inn det du vil lagre");
                searchFor = input.readLine().trim();
                write(searchFor);

            } else if (funksjon.equals("read")) {

                System.out.println("\nTakk, skriv så inn det du vil søke");
                searchFor = input.readLine().trim();
                System.out.println(read(Integer.parseInt(searchFor)));
            } else if (funksjon.equals("seek")) {

                System.out.println("\nTakk, skriv så inn det du vil lese");
                searchFor = input.readLine().trim();
                if(seek(searchFor) == 999){System.out.println("Ingen resultat");} else {
                System.out.println(seek(searchFor));}

            } else {
                System.out.println("Det du skrev er ikke valid.");
            }

        }
    }


    public void write(String input) {
        driver.dWrite(input);
    }

    public String read(int index) {
        return driver.dRead(index);
    }

    public int seek(String searchString) {
        return driver.dSearch(searchString);
    }

}

