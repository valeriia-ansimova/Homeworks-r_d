package homework23;

import java.io.*;

public class FileManager {

    public void saveTextToFile(String fileName, String fileContent) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(fileContent);

        writer.close();
    }

    public String readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = reader.readLine();
        return line;
    }
}
