import java.util.ArrayList;

/**
 * Created by jens on 10.04.15.
 */

public class HDD {

    ArrayList<String> storage;

    public HDD() {
        storage = new ArrayList<String>();
    }

    public void write(String input) {
        System.out.println(input + " ble gitt");
        storage.add(input);
        System.out.println("Lagret " + input);
    }

    public String read(int index) {

        return storage.get(index);

    }

    public int seek(String searchString) {
int result = 999;
        for (int step = 0; step < storage.size(); step++) {
            if (storage.get(step).equals(searchString)) {
                // Fant den, returnere index
                result = step;
            }
        }
        return result;
    }

}
