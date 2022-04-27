package Files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Boyan\\Downloads\\javapractise\\src\\Files\\art.txt");
        try {
            Scanner fileReader = new Scanner(file,"windows-1251");
            int lineNumber = 0;
            while (fileReader.hasNextLine()){
                lineNumber++;
                System.out.printf("Line %d: %s%n",lineNumber,fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

