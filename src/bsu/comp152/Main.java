package bsu.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var fileLoc = Paths.get("warpeace.txt");
        List<String> allLines = null;
        try{
        allLines = Files.readAllLines(fileLoc);
        }catch (IOException e){
            System.out.println("Error reading File");
        }
        if(allLines ==null)
            System.exit(-1);
        //now we have the data - work with it instead of printing it
        System.out.println(allLines);
    }
}
