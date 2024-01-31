package FileAndExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("src/FileAndExceptionHandling/Poem.txt");
            writer.write("Roses are Red \nViolets are blue\n");
            writer.append("Lovely");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
