package Files;

import java.io.*;

public class fileclass {
    public static void main(String[] args) {
        try {
            String[] names = {"Aaron","Boyan","Dimitar","Miro"};
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello\n");
            writer.write("How are you?");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String s;
            while ((s = reader.readLine())!= null) {
                System.out.println(s);
            }
            reader.close();
        }catch (IOException e){
            e.getMessage();
        }

        }

}
