import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {

    private File file;
    private Scanner reader;

    public void loadFile(String loc){

        try{
            file = new File(loc);
            reader = new Scanner(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find the file");
            e.printStackTrace();
        }

    }

    public String readLine(){
        if(reader.hasNextLine())
            return reader.nextLine();
        else
            return null;
    }

}
