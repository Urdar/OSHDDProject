import java.util.ArrayList;

/**
 * Created by jens on 10.04.15.
 */
public class HDD {

    ArrayList<String> storage;

    private HDD() {
        ArrayList<String> storage = new ArrayList<String>();

    }

    public void write(String input) {
        storage.add(input);
    }

    public String read(int index) {

        return storage.get(index);

    }

    public int seek(String searchString) {

        for (int step = 0; step < storage.size(); step++) {
            if (storage.get(step) == searchString) {
                // Fant den, returnere index
                return step;
            }
        }
        return 0;
    }

}
