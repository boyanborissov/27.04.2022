package Files;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("num.txt");
            writer.write("OOOpa\n");
            writer.append("By bro");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
