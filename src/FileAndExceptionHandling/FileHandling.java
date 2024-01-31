package FileAndExceptionHandling;

import java.io.File;

public class FileHandling {
    public static void main(String[] args){
        File file = new File("src/FileAndExceptionHandling/File.txt");
        if(file.exists()){
            System.out.println("The file exists :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
        }
        else {
            System.out.println("The file doesn't exists :(");
        }
    }
}
