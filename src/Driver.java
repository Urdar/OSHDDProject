/**
 * Created by knut on 10.04.15.
 */
public class Driver {

    public HDD hardDrive;

    public Driver(){
        hardDrive = new HDD();
    }

    public String dRead(int index){
        return hardDrive.read(index);
    }

    public void dWrite(String input){
        hardDrive.write(input);
    }

    public int dSearch(String searchString){
        return hardDrive.seek(searchString);
    }

}
