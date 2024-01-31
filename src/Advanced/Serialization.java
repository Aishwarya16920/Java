package Advanced;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serialization {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Zara";
        user.password = "zara_01";

        FileOutputStream fileOut = new FileOutputStream("src/Advanced/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved :)");

        long serialVersisonUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersisonUID);
    }
}
