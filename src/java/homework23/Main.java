package homework23;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "testFile";
        String fileContent = "Hello World! - 777";

        FileManager fileManager = new FileManager();
        fileManager.saveTextToFile(fileName, fileContent);

        String lineFromFile = fileManager.readFromFile(fileName);
        System.out.println(lineFromFile);
    }

}
