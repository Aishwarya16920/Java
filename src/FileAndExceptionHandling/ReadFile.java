package FileAndExceptionHandling;

import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("src/FileAndExceptionHandling/Poem.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
